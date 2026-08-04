package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍَۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10492l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f21363l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f21364l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C9190l f21365l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f21366l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f21367l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f21368l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10492l(C9190l c9190l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f21365l = c9190l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C11129l c11129l;
        int i;
        int i2;
        int i3;
        String strPremium;
        int i4;
        int i5;
        String str;
        C9190l c9190l = this.f21365l;
        C12463l c12463l = c9190l.f18903l;
        C16761l c16761l = c9190l.f18901l;
        int i6 = this.f21368l;
        if (i6 == 0) {
            AbstractC2829l.crashlytics(obj);
            c11129l = (C11129l) this.f21364l;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f21366l;
            i2 = this.f21367l;
            i3 = this.f21363l;
            c11129l = (C11129l) this.f21364l;
            AbstractC2829l.crashlytics(obj);
        }
        if (i3 >= Math.min(c9190l.f18904l + 10, c16761l.loadAd)) {
            return Unit.INSTANCE;
        }
        int i7 = i3 + 1;
        int iCrashlytics = c16761l.crashlytics(i3);
        switch (iCrashlytics) {
            case 0:
                strPremium = "up";
                break;
            case 1:
                String strSubscription = AbstractC15560l.subscription(c12463l.admob(i2), "down ");
                i2++;
                strPremium = strSubscription;
                break;
            case 2:
                strPremium = AbstractC12589l.premium(c16761l.crashlytics(i7), c16761l.crashlytics(i3 + 2), "remove ", " ");
                i7 = i3 + 3;
                break;
            case 3:
                int iCrashlytics2 = c16761l.crashlytics(i7);
                int iCrashlytics3 = c16761l.crashlytics(i3 + 2);
                int iCrashlytics4 = c16761l.crashlytics(i3 + 3);
                StringBuilder sbSubscription = AbstractC14814l.subscription(iCrashlytics2, iCrashlytics3, "move ", " ", " ");
                sbSubscription.append(iCrashlytics4);
                strPremium = sbSubscription.toString();
                i7 = i3 + 4;
                break;
            case 4:
                strPremium = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iCrashlytics5 = c16761l.crashlytics(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iCrashlytics5 + " " + c12463l.admob(i2);
                int i8 = i4;
                strPremium = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iCrashlytics6 = c16761l.crashlytics(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iCrashlytics6 + " " + c12463l.admob(i2);
                int i9 = i4;
                strPremium = str;
                i7 = i9;
                i2 = i5;
                break;
            case 7:
                Object objAdmob = c12463l.admob(i2);
                AbstractC9464l.purchase(2, objAdmob);
                i2 += 2;
                strPremium = "apply " + ((Function2) objAdmob);
                break;
            case 8:
                strPremium = AbstractC15560l.subscription(c9190l.f18902l.admob(i), "reuse ");
                i++;
                break;
            case 9:
                strPremium = "recompose pending";
                break;
            default:
                strPremium = AbstractC0653l.vip(iCrashlytics, "unknown op: ");
                break;
        }
        this.f21364l = c11129l;
        this.f21363l = i7;
        this.f21367l = i2;
        this.f21366l = i;
        this.f21368l = 1;
        c11129l.amazon(this, i3 + ": " + strPremium);
        return EnumC9342l.f19165l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C10492l c10492l = new C10492l(this.f21365l, interfaceC14029l);
        c10492l.f21364l = obj;
        return c10492l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10492l) ads((InterfaceC14029l) obj2, (C11129l) obj)).Signature(Unit.INSTANCE);
    }
}
