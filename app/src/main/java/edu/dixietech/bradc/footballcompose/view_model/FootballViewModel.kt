package edu.dixietech.bradc.footballcompose.view_model

import androidx.lifecycle.ViewModel
import edu.dixietech.bradc.footballcompose.model.Team

class FootballViewModel() : ViewModel() {
    val league = nfl

    companion object {
        val nfl = hashMapOf(
            "NFC East" to listOf(
                Team(
                    0,
                    "Dallas Cowboys",
                    arrayOf(0xFF003594, 0xFF041E42, 0xFF869397),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/dal.png"
                ),
                Team(
                    1,
                    "New York Giants",
                    arrayOf(0xFF0B2265, 0xFFA71930, 0xFFA5ACAF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/nyg.png"
                ),
                Team(
                    2,
                    "Philadelphia Eagles",
                    arrayOf(0xFF004C54, 0xFFA5ACAF, 0xFF000000),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/phi.png"
                ),
                Team(
                    3,
                    "Washington Commanders",
                    arrayOf(0xFF5A1414, 0xFFFFB612),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/wsh.png"
                )
            ), "NFC South" to listOf(
                Team(
                    4,
                    "Atlanta Falcons",
                    arrayOf(0xFFA71930, 0xFF000000, 0xFFA5ACAF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/atl.png"
                ), Team(
                    5,
                    "Carolina Panthers",
                    arrayOf(0xFF0085CA, 0xFF101820, 0xFFBFC0BF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/car.png"
                ), Team(
                    6,
                    "New Orleans Saints",
                    arrayOf(0xFFD3BC8D, 0xFF101820),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/no.png"
                ), Team(
                    7,
                    "Tampa Bay Buccaneers",
                    arrayOf(0xFFD50A0A, 0xFFFF7900, 0xFF0A0A08, 0xFFB1BABF, 0xFF34302B),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/tb.png"
                )
            ), "NFC North" to listOf(
                Team(
                    8,
                    "Chicago Bears",
                    arrayOf(0xFF0B162A, 0xFFC83803),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/chi.png"
                ), Team(
                    9,
                    "Detroit Lions",
                    arrayOf(0xFF0076B6, 0xFFB0B7BC, 0xFF000000, 0xFFFFFFFF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/det.png"
                ), Team(
                    10,
                    "Green Bay Packers",
                    arrayOf(0xFF203731, 0xFFFFB612),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/gb.png"
                ), Team(
                    11,
                    "Minnesota Vikings",
                    arrayOf(0xFF4F2683, 0xFFFFC62F),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/min.png"
                )
            ), "NFC West" to listOf(
                Team(
                    13,
                    "Arizona Cardinals",
                    arrayOf(0xFF97233F, 0xFF000000, 0xFFFFB612),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/ari.png"
                ),
                Team(
                    14,
                    "Los Angeles Rams",
                    arrayOf(0xFF003594, 0xFFFFA300, 0xFFFF8200, 0xFFFFD100, 0xFFFFFFFF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/lar.png"
                ),
                Team(
                    15,
                    "San Francisco 49ers",
                    arrayOf(0xFFAA0000, 0xFFB3995D),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/sf.png"
                ),
                Team(
                    16,
                    "Seattle Seahawks",
                    arrayOf(0xFF002244, 0xFF69BE28, 0xFFA5ACAF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/sea.png"
                )
            ), "AFC East" to listOf(
                Team(
                    16,
                    "Buffalo Bills",
                    arrayOf(0xFF00338D, 0xFFC60C30),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/buf.png"
                ),
                Team(
                    17,
                    "Miami Dolphins",
                    arrayOf(0xFF008E97, 0xFFFC4C02, 0xFF005778),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/mia.png"
                ),
                Team(
                    18,
                    "New England Patriots",
                    arrayOf(0xFF002244, 0xFFC60C30, 0xFFB0B7BC),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/ne.png"
                ),
                Team(
                    19,
                    "New York Jets",
                    arrayOf(0xFF125740, 0xFF000000, 0xFFFFFFFF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/nyj.png"
                ),
            ), "AFC South" to listOf(
                Team(
                    20,
                    "Houston Texans",
                    arrayOf(0xFF03202F, 0xFFA71930),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/hou.png"
                ),
                Team(
                    21,
                    "Indianapolis Colts",
                    arrayOf(0xFF002C5F, 0xFFA2AAAD),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/ind.png"
                ),
                Team(
                    22,
                    "Jacksonville Jaguars",
                    arrayOf(0xFF101820, 0xFFD7A22A, 0xFF9F792C, 0xFF006778),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/jax.png"
                ),
                Team(
                    23,
                    "Tennessee Titans",
                    arrayOf(0xFF0C2340, 0xFF4B92DB, 0xFFC8102E, 0xFF8A8D8F),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/ten.png"
                ),
            ), "AFC North" to listOf(
                Team(
                    24,
                    "Baltimore Ravens",
                    arrayOf(0xFF241773, 0xFF000000, 0xFF9E7C0C, 0xFFC60C30),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/bal.png"
                ),
                Team(
                    25,
                    "Cincinnati Bengals",
                    arrayOf(0xFFFB4F14, 0xFF000000),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/cin.png"
                ),
                Team(
                    26,
                    "Cleveland Browns",
                    arrayOf(0xFF311D00, 0xFFFF3C00, 0xFF7C7E7C, 0xFFFFFFFF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/cle.png"
                ),
                Team(
                    27,
                    "Pittsburgh Steelers",
                    arrayOf(0xFFFFB612, 0xFF101820, 0xFF003087, 0xFFC60C30, 0xFFA5ACAF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/pit.png"
                ),
            ), "AFC West" to listOf(
                Team(
                    28,
                    "Denver Broncos",
                    arrayOf(0xFFFB4F14, 0xFF002244),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/den.png"
                ), Team(
                    29,
                    "Kansas City Chiefs",
                    arrayOf(0xFFE31837, 0xFFFFB81C),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/kc.png"
                ), Team(
                    30,
                    "Las Vegas Raiders",
                    arrayOf(0xFF000000, 0xFFA5ACAF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/lv.png"
                ), Team(
                    31,
                    "Los Angeles Chargers",
                    arrayOf(0xFF0080C6, 0xFFFFC20E, 0xFFFFFFFF),
                    "https://a.espncdn.com/i/teamlogos/nfl/500/lac.png"
                )
            )
        )
    }
}