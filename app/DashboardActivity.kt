class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val totalPlants = findViewById<TextView>(R.id.tvTotalPlants)
        val watered = findViewById<TextView>(R.id.tvWatered)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnScan = findViewById<Button>(R.id.btnScan)
        val recycler = findViewById<RecyclerView>(R.id.recyclerDashboard)

        val plantList = listOf(
            Plant("Aloe Vera", "Every 2 days"),
            Plant("Money Plant", "Daily"),
            Plant("Snake Plant", "Weekly")
        )

        totalPlants.text = plantList.size.toString()
        watered.text = "1" // Example

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = PlantAdapter(plantList)

        btnAdd.setOnClickListener {
            Toast.makeText(this, "Add Plant Clicked", Toast.LENGTH_SHORT).show()
        }

        btnScan.setOnClickListener {
            Toast.makeText(this, "Scan Feature Coming Soon", Toast.LENGTH_SHORT).show()
        }
    }
}
