__________________________________________________________________________________
# Ski Lift Data Analysis: Option 1 (CS5004, Summer 2025)
__________________________________________________________________________________
Reads one day of RFID scan data and produces three CSV reports:

- `skiers.csv`- top 100 skiers by total vertical (descending)
- `lifts.csv` - rides per lift (1–40) for the whole day (ascending by lift id)
- `hours.csv` - top 10 busiest lifts per hour (6 hours: 9am–3pm)
- numbers are per-lift per-hour totals across all skiers

__________________________________________________________________________________
# How to Run
__________________________________________________________________________________
You must pass **two arguments**:
1) the input CSV path (e.g., `src/test/java/resources/ski_lift_data.csv`)
2) the output folder (will be created if missing; e.g., `out`)

# java -cp build/classes/java/main Main src/test/java/resources/ski_lift_data.csv out


