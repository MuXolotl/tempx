package defpackage;

/* JADX INFO: renamed from: lؘۗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5903l implements InterfaceC6759l {
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_UNKNOWN(0),
    IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE(1),
    IAB_TCF_PURPOSE_SELECT_BASIC_ADS(2),
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE(3),
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS(4),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE(5),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT(6),
    IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE(7),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE(8),
    IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS(9),
    IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS(10),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT(11),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f12450l;

    EnumC5903l(int i) {
        this.f12450l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12450l);
    }

    @Override // defpackage.InterfaceC6759l
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f12450l;
        }
        C8339l.metrica("Can't get the number of an unknown enum value.");
        return 0;
    }
}
