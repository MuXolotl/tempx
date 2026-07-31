package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lْٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13479l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26462l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1351l f26463l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f26464l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26465l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f26466l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f26467l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Function2 f26468l;

    public /* synthetic */ C13479l(String str, boolean z, C2403l c2403l, Function2 function2, Function2 function3, C1351l c1351l, int i) {
        this.f26465l = i;
        this.f26464l = str;
        this.f26462l = z;
        this.f26467l = c2403l;
        this.f26466l = function2;
        this.f26468l = function3;
        this.f26463l = c1351l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C15578l c15578l;
        C15578l c15578l2;
        int i = this.f26465l;
        Function2 function2 = this.f26468l;
        int i2 = 2;
        byte b = 0;
        switch (i) {
            case 0:
                Function2 function3 = (Function2) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.admob(function3) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C8565l c8565l = C8565l.f17654l;
                    if (function2 == null) {
                        c6956l.m2123default(-479264657);
                        c6956l.startapp(false);
                        c15578l = null;
                    } else {
                        c6956l.m2123default(-479264656);
                        C15578l c15578lAmazon = AbstractC14566l.amazon(2049761291, new C13393l(function2, i2, b), c6956l);
                        c6956l.startapp(false);
                        c15578l = c15578lAmazon;
                    }
                    c6956l.m2123default(-479052214);
                    c6956l.startapp(false);
                    C7038l c7038l = C7038l.yandex;
                    c8565l.crashlytics(this.f26464l, function3, this.f26462l, this.f26467l, this.f26466l, c15578l, null, AbstractC2610l.loadAd(c6956l, 7), this.f26463l, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC6974l.crashlytics, c6956l, ((iIntValue << 3) & 112) | 27648);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                Function2 function4 = (Function2) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.admob(function4) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int i3 = iIntValue2;
                    C8565l c8565l2 = C8565l.f17654l;
                    if (function2 == null) {
                        c6956l2.m2123default(1405051955);
                        c6956l2.startapp(false);
                        c15578l2 = null;
                    } else {
                        c6956l2.m2123default(1405051956);
                        C15578l c15578lAmazon2 = AbstractC14566l.amazon(1802574279, new C13393l(function2, 11, b), c6956l2);
                        c6956l2.startapp(false);
                        c15578l2 = c15578lAmazon2;
                    }
                    c6956l2.m2123default(1405264398);
                    c6956l2.startapp(false);
                    C7038l c7038l2 = C7038l.yandex;
                    c8565l2.crashlytics(this.f26464l, function4, this.f26462l, this.f26467l, this.f26466l, c15578l2, null, AbstractC2610l.loadAd(c6956l2, 7), this.f26463l, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC10999l.amazon, c6956l2, ((i3 << 3) & 112) | 27648);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
