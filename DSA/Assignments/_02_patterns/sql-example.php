    <style>
        .container {
            width: 100%;
            overflow-y: auto;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            /* border: 2px solid #2d2d2d !important; */

        }

        td,
        th {
            border: none !important;
        }

        th {
            background-color: #54585d;
            color: #ffffff;
            font-weight: bold;
            font-size: 13px;
            /* border: 2px solid #2d2d2d !important; */

        }

        tr {
            border-top: 2px solid #2d2d2d !important;
            border-bottom: 2px solid #2d2d2d !important;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>


    <?php
    function connect_to_secondary_database()
    {
        global $wpdb; // Use the global $wpdb object

        $secondary_db = new mysqli(DB_HOST, DB_USER2, DB_PASSWORD2, DB_NAME2);

        // Check for connection errors
        if ($secondary_db->connect_error) {
            echo "<h1>There was some error while fetching data, try again later.</h1>";
            die("Connection to secondary database failed: " . $secondary_db->connect_error);
        }

        // Set the charset to match your database's character set
        $secondary_db->set_charset("utf8");
        return $secondary_db;
    }


    $secondary_db = connect_to_secondary_database();
    $table_name = "upcoming_ipo";


    $query = "SELECT * FROM $table_name";
    $result = $secondary_db->query($query);

    if ($result) {
        echo "<div class='container'>";
        echo '<table border=1>';
        echo '<tbody>';
        echo '<tr>';
        echo '<th>ipo_id</th>';
        echo '<th>Company_Name</th>';
        echo '<th>Bid_Date</th>';
        echo '<th>Price_Band</th>';
        echo '<th>Issue_Size</th>';
        echo '<th>Lot_Size</th>';
        echo '<th>Opening_Date</th>';
        echo '<th>Closing_Date</th>';
        echo '<th>Listing_Date</th>';
        echo '<th>Minimum_Investment</th>';
        echo '<th>Maximum_Investment</th>';
        echo '<th>Estimated_Listing_Price</th>';
        echo '<th>Face_value</th>';
        echo '<th>Listing_At</th>';
        echo '<th>Basis_of_Allotment</th>';
        echo '<th>Market_capital_at_issue price (Rs_Cores)</th>';
        echo '</tr>';
        while ($row = $result->fetch_assoc()) {
            echo '<tr>';
            foreach ($row as $key => $value) {
                echo '<td >' . $value . '</td>';
            }
        }
        echo '</tr>';
        echo '</tbody>';
        echo '</table>';
        echo '</div>';
        $result->free(); // Free the result set
    } else {
        echo "Query failed: " . $secondary_db->error;
    }

    // Close the secondary database connection when done
    $secondary_db->close();

    ?>