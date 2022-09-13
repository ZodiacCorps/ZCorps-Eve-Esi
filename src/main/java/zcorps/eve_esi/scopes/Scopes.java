package zcorps.eve_esi.scopes;

public interface Scopes {
    public final String[] MARKET_SCOPES = {"esi-markets.read_character_orders.v1",
            "esi-markets.read_corporation_orders.v1", "esi-markets.structure_markets.v1"};

    public final String[] CORPORATION_SCOPES = {"esi-corporations.read_container_logs.v1", " esi-corporations.read_blueprints.v1",
            "esi-corporations.read_divisions.v1", "esi-corporations.read_facilities.v1", "esi-corporations.read_medals.v1",
            "esi-corporations.read_corporation_membership.v1", "esi-corporations.track_members.v1", "esi-corporations.read_titles.v1",
            "esi-wallet.read_corporation_wallets.v1", "esi-corporations.read_standings.v1", "esi-corporations.read_starbases.v1",
            "esi-corporations.read_structures.v1"

    };
    public final String[][] SCOPES = {CORPORATION_SCOPES, MARKET_SCOPES};
}
