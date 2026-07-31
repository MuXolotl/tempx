package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5766l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f12153l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f12154l;

    public C5766l() {
        super(0);
        Boolean bool = Boolean.FALSE;
        this.f12153l = AbstractC8020l.smaato(bool);
        this.f12154l = AbstractC8020l.smaato(bool);
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static final void m1848this(Function0 function0, Function1 function1, C7968l c7968l, String str, EnumC1518l enumC1518l, C6956l c6956l) {
        int i = AbstractC15548l.yandex;
        C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510);
        boolean zBilling = c6956l.billing(function0) | c6956l.billing(function1) | c6956l.admob(c7968l);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            C17026l c17026l = new C17026l(function0, function1, c7968l, enumC1518l, 0);
            c6956l.m2147try(c17026l);
            objM2132native = c17026l;
        }
        AbstractC13319l.yandex(AbstractC14566l.amazon(-149431864, new C4210l(str, 3), c6956l), AbstractC9151l.loadAd(C4346l.f8873l, false, null, (Function0) objM2132native, 15), null, null, null, AbstractC14566l.amazon(1355615117, new Cpublic(c7968l, enumC1518l, 17), c6956l), c15087lYandex, c6956l, 196614, 412);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m1849abstract(boolean z, C13939l c13939l, Function0 function0, Function0 function1, Function0 function2, Function0 function3, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-509803412);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c13939l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.admob(this) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C2942l(this, 0);
                c6956l.m2147try(objM2132native);
            }
            AbstractC2426l.crashlytics((Function0) objM2132native, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, AbstractC14566l.amazon(-1443357238, new C9572l(c13939l, function2, function1, z, function0, function3), c6956l), c6956l, 0, 8190);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(this, z, c13939l, function0, function1, function2, function3, i);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m1850finally(Function0 function0, C7968l c7968l, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-991067315);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c7968l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC2426l.crashlytics(function0, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, AbstractC14566l.amazon(-1754194001, new Cprotected(function0, function1, c7968l, 10), c6956l), c6956l, i2 & 14, 8190);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, function0, c7968l, function1, i, 3);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1851import(C13939l c13939l, Function1 function1, C6956l c6956l, int i) {
        int i2;
        C5766l c5766l = this;
        c6956l.m2133new(-214860224);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c13939l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c5766l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC8020l.smaato(Boolean.TRUE);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.smaato(C11507l.f23131l);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native2;
            Boolean bool = (Boolean) interfaceC8714l.getValue();
            bool.booleanValue();
            boolean zAdmob = c6956l.admob(context) | c6956l.admob(c5766l) | c6956l.admob(c13939l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == obj) {
                Object c1914l = new C1914l(context, this, interfaceC8714l, c13939l, interfaceC8714l2, (InterfaceC14029l) null);
                c5766l = this;
                c6956l.m2147try(c1914l);
                objM2132native3 = c1914l;
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) objM2132native3);
            boolean zAdmob2 = c6956l.admob(c5766l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob2 || objM2132native4 == obj) {
                objM2132native4 = new C2942l(c5766l, 3);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC2426l.crashlytics((Function0) objM2132native4, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, AbstractC14566l.amazon(1898016286, new Cprotected(function1, interfaceC8714l2, interfaceC8714l, 7), c6956l), c6956l, 0, 8190);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(c5766l, c13939l, function1, i, 2);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m1852instanceof(String str, String str2, Function0 function0, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-983596032);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(str2) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC3383l.amazon(interfaceC17242l, null, null, null, null, AbstractC14566l.amazon(712694132, new Cprotected(str, str2, function0, 9), c6956l), c6956l, ((i2 >> 9) & 14) | 196608, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0843l(this, str, str2, function0, interfaceC17242l, i, 0);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC4138l interfaceC4138lLoadAd;
        C6956l c6956l2;
        int i2;
        c6956l.m2133new(1770371095);
        final int i3 = 2;
        int i4 = i | (c6956l.admob(this) ? 4 : 2);
        final int i5 = 1;
        final byte b = 0;
        if (c6956l.m2127for(i4 & 1, (i4 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            final InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            final Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3606l).yandex();
            Object obj2 = AbstractC16584l.crashlytics().f3606l;
            final InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C13939l) ((AbstractC11904l) C7196l.f15029l.f33214l), c6956l, 0);
            boolean z = ((C13939l) interfaceC8714lLoadAd.getValue()).f27228l == null && ((C13939l) interfaceC8714lLoadAd.getValue()).f27229l == null && ((C13939l) interfaceC8714lLoadAd.getValue()).f27230l == null && ((C13939l) interfaceC8714lLoadAd.getValue()).f27227l.isEmpty();
            if (Build.VERSION.SDK_INT >= 31) {
                c6956l.m2123default(-1072517771);
                interfaceC4138lLoadAd = AbstractC12027l.loadAd("android.permission.BLUETOOTH_CONNECT", c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1072426755);
                interfaceC4138lLoadAd = AbstractC12027l.loadAd("android.permission.BLUETOOTH", c6956l);
                c6956l.startapp(false);
            }
            final InterfaceC4138l interfaceC4138l = interfaceC4138lLoadAd;
            final InterfaceC4138l interfaceC4138lLoadAd2 = AbstractC12027l.loadAd("android.permission.POST_NOTIFICATIONS", c6956l);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
                objM2132native2 = Boolean.valueOf(powerManager != null && powerManager.isIgnoringBatteryOptimizations(context.getPackageName()));
                c6956l.m2147try(objM2132native2);
            }
            final boolean zBooleanValue = ((Boolean) objM2132native2).booleanValue();
            if (((Boolean) this.f12153l.getValue()).booleanValue()) {
                c6956l.m2123default(-1071939528);
                boolean zEquals = interfaceC4138l.amazon().equals(C17306l.yandex);
                C13939l c13939l = (C13939l) interfaceC8714lLoadAd.getValue();
                boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(this);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob || objM2132native3 == obj) {
                    objM2132native3 = new Function0() { // from class: lؙٖۦ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i6 = b;
                            InterfaceC14029l interfaceC14029l = null;
                            C5766l c5766l = this;
                            InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                            int i7 = 0;
                            switch (i6) {
                                case 0:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, i7), 3);
                                    break;
                                case 1:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, 1), 3);
                                    break;
                                default:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, 2), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native3);
                }
                Function0 function0 = (Function0) objM2132native3;
                boolean zAdmob2 = c6956l.admob(interfaceC2262l) | c6956l.admob(this);
                Object objM2132native4 = c6956l.m2132native();
                if (zAdmob2 || objM2132native4 == obj) {
                    objM2132native4 = new Function0() { // from class: lؙٖۦ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i6 = i5;
                            InterfaceC14029l interfaceC14029l = null;
                            C5766l c5766l = this;
                            InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                            int i7 = 0;
                            switch (i6) {
                                case 0:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, i7), 3);
                                    break;
                                case 1:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, 1), 3);
                                    break;
                                default:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, 2), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native4);
                }
                Function0 function1 = (Function0) objM2132native4;
                boolean zAdmob3 = c6956l.admob(interfaceC2262l) | c6956l.admob(this);
                Object objM2132native5 = c6956l.m2132native();
                if (zAdmob3 || objM2132native5 == obj) {
                    objM2132native5 = new Function0() { // from class: lؙٖۦ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i6 = i3;
                            InterfaceC14029l interfaceC14029l = null;
                            C5766l c5766l = this;
                            InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                            int i7 = 0;
                            switch (i6) {
                                case 0:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, i7), 3);
                                    break;
                                case 1:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, 1), 3);
                                    break;
                                default:
                                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1174l(c5766l, interfaceC14029l, 2), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native5);
                }
                Function0 function2 = (Function0) objM2132native5;
                boolean zAdmob4 = c6956l.admob(this);
                Object objM2132native6 = c6956l.m2132native();
                if (zAdmob4 || objM2132native6 == obj) {
                    objM2132native6 = new C2942l(this, 2);
                    c6956l.m2147try(objM2132native6);
                }
                i2 = -1076689813;
                m1849abstract(zEquals, c13939l, function0, function1, function2, (Function0) objM2132native6, c6956l, (i4 << 18) & 3670016);
                c6956l2 = c6956l;
            } else {
                c6956l2 = c6956l;
                i2 = -1076689813;
                c6956l2.m2123default(-1076689813);
            }
            c6956l2.startapp(false);
            if (((Boolean) this.f12154l.getValue()).booleanValue()) {
                c6956l2.m2123default(-1070821978);
                C13939l c13939l2 = (C13939l) interfaceC8714lLoadAd.getValue();
                boolean zAdmob5 = c6956l2.admob(interfaceC2262l) | c6956l2.admob(this);
                Object objM2132native7 = c6956l2.m2132native();
                if (zAdmob5 || objM2132native7 == obj) {
                    objM2132native7 = new C0464l(interfaceC2262l, this, 10);
                    c6956l2.m2147try(objM2132native7);
                }
                m1851import(c13939l2, (Function1) objM2132native7, c6956l2, (i4 << 6) & 896);
            } else {
                c6956l2.m2123default(i2);
            }
            c6956l2.startapp(false);
            final boolean z2 = z;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-98189869, new C18143l(this, 1, b), c6956l2), null, null, AbstractC14566l.amazon(664542640, new C18143l(this, 2, b), c6956l2), 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(1780311528, new Function3(this) { // from class: lؔۚۢ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C5766l f6301l;

                {
                    this.f6301l = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj3;
                    C6956l c6956l3 = (C6956l) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c6956l3.billing(interfaceC11780l) ? 4 : 2;
                    }
                    if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                        InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f);
                        C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                        final InterfaceC4138l interfaceC4138l2 = interfaceC4138l;
                        boolean zBilling = c6956l3.billing(interfaceC4138l2);
                        final C5766l c5766l = this.f6301l;
                        boolean zAdmob6 = zBilling | c6956l3.admob(c5766l);
                        final InterfaceC4138l interfaceC4138l3 = interfaceC4138lLoadAd2;
                        boolean zBilling2 = zAdmob6 | c6956l3.billing(interfaceC4138l3);
                        final InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                        boolean zAdmob7 = zBilling2 | c6956l3.admob(interfaceC2262l2);
                        final Context context2 = context;
                        boolean zAdmob8 = zAdmob7 | c6956l3.admob(context2);
                        final boolean z3 = z2;
                        boolean zMopub = zAdmob8 | c6956l3.mopub(z3);
                        final InterfaceC8714l interfaceC8714l = interfaceC8714lLoadAd;
                        boolean zBilling3 = zMopub | c6956l3.billing(interfaceC8714l);
                        Object objM2132native8 = c6956l3.m2132native();
                        if (zBilling3 || objM2132native8 == C1867l.yandex) {
                            final boolean z4 = zBooleanValue;
                            Function1 function3 = new Function1() { // from class: lؑٙۢ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    C1336l c1336l = (C1336l) obj6;
                                    AbstractC1757l.appmetrica(c1336l, null, null, AbstractC17860l.amazon, 3);
                                    final InterfaceC4138l interfaceC4138l4 = interfaceC4138l2;
                                    InterfaceC12152l interfaceC12152lAmazon = interfaceC4138l4.amazon();
                                    C17306l c17306l = C17306l.yandex;
                                    boolean zEquals2 = interfaceC12152lAmazon.equals(c17306l);
                                    final int i6 = 0;
                                    final C5766l c5766l2 = c5766l;
                                    final int i7 = 1;
                                    if (!zEquals2) {
                                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(909858584, true, new Function3() { // from class: lُؙ٘
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                int i8 = i6;
                                                C4346l c4346l = C4346l.f8873l;
                                                C13863l c13863l = C1867l.yandex;
                                                switch (i8) {
                                                    case 0:
                                                        C7091l c7091l = (C7091l) obj7;
                                                        C6956l c6956l4 = (C6956l) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= c6956l4.billing(c7091l) ? 4 : 2;
                                                        }
                                                        if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.as2_setup_bt);
                                                            String strPurchase2 = AbstractC11999l.purchase(c6956l4, R.string.as2_setup_bt_text);
                                                            InterfaceC4138l interfaceC4138l5 = interfaceC4138l4;
                                                            boolean zBilling4 = c6956l4.billing(interfaceC4138l5);
                                                            Object objM2132native9 = c6956l4.m2132native();
                                                            if (zBilling4 || objM2132native9 == c13863l) {
                                                                C2944l c2944l = new C2944l(0, interfaceC4138l5, InterfaceC4138l.class, "launchPermissionRequest", "launchPermissionRequest()V", 0, 0, 2);
                                                                c6956l4.m2147try(c2944l);
                                                                objM2132native9 = c2944l;
                                                            }
                                                            c5766l2.m1852instanceof(strPurchase, strPurchase2, (Function0) ((InterfaceC5059l) objM2132native9), AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2), c6956l4, 0);
                                                        } else {
                                                            c6956l4.m2124else();
                                                        }
                                                        break;
                                                    default:
                                                        C7091l c7091l2 = (C7091l) obj7;
                                                        C6956l c6956l5 = (C6956l) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        if ((iIntValue3 & 6) == 0) {
                                                            iIntValue3 |= c6956l5.billing(c7091l2) ? 4 : 2;
                                                        }
                                                        if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                            String strPurchase3 = AbstractC11999l.purchase(c6956l5, R.string.as2_setup_nt);
                                                            String strPurchase4 = AbstractC11999l.purchase(c6956l5, R.string.as2_setup_nt_text);
                                                            InterfaceC4138l interfaceC4138l6 = interfaceC4138l4;
                                                            boolean zBilling5 = c6956l5.billing(interfaceC4138l6);
                                                            Object objM2132native10 = c6956l5.m2132native();
                                                            if (zBilling5 || objM2132native10 == c13863l) {
                                                                C2944l c2944l2 = new C2944l(0, interfaceC4138l6, InterfaceC4138l.class, "launchPermissionRequest", "launchPermissionRequest()V", 0, 0, 3);
                                                                c6956l5.m2147try(c2944l2);
                                                                objM2132native10 = c2944l2;
                                                            }
                                                            c5766l2.m1852instanceof(strPurchase3, strPurchase4, (Function0) ((InterfaceC5059l) objM2132native10), AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2), c6956l5, 0);
                                                        } else {
                                                            c6956l5.m2124else();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 3);
                                    }
                                    final InterfaceC4138l interfaceC4138l5 = interfaceC4138l3;
                                    if (!interfaceC4138l5.amazon().equals(c17306l)) {
                                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-279277937, true, new Function3() { // from class: lُؙ٘
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                int i8 = i7;
                                                C4346l c4346l = C4346l.f8873l;
                                                C13863l c13863l = C1867l.yandex;
                                                switch (i8) {
                                                    case 0:
                                                        C7091l c7091l = (C7091l) obj7;
                                                        C6956l c6956l4 = (C6956l) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= c6956l4.billing(c7091l) ? 4 : 2;
                                                        }
                                                        if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.as2_setup_bt);
                                                            String strPurchase2 = AbstractC11999l.purchase(c6956l4, R.string.as2_setup_bt_text);
                                                            InterfaceC4138l interfaceC4138l6 = interfaceC4138l5;
                                                            boolean zBilling4 = c6956l4.billing(interfaceC4138l6);
                                                            Object objM2132native9 = c6956l4.m2132native();
                                                            if (zBilling4 || objM2132native9 == c13863l) {
                                                                C2944l c2944l = new C2944l(0, interfaceC4138l6, InterfaceC4138l.class, "launchPermissionRequest", "launchPermissionRequest()V", 0, 0, 2);
                                                                c6956l4.m2147try(c2944l);
                                                                objM2132native9 = c2944l;
                                                            }
                                                            c5766l2.m1852instanceof(strPurchase, strPurchase2, (Function0) ((InterfaceC5059l) objM2132native9), AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2), c6956l4, 0);
                                                        } else {
                                                            c6956l4.m2124else();
                                                        }
                                                        break;
                                                    default:
                                                        C7091l c7091l2 = (C7091l) obj7;
                                                        C6956l c6956l5 = (C6956l) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        if ((iIntValue3 & 6) == 0) {
                                                            iIntValue3 |= c6956l5.billing(c7091l2) ? 4 : 2;
                                                        }
                                                        if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                            String strPurchase3 = AbstractC11999l.purchase(c6956l5, R.string.as2_setup_nt);
                                                            String strPurchase4 = AbstractC11999l.purchase(c6956l5, R.string.as2_setup_nt_text);
                                                            InterfaceC4138l interfaceC4138l7 = interfaceC4138l5;
                                                            boolean zBilling5 = c6956l5.billing(interfaceC4138l7);
                                                            Object objM2132native10 = c6956l5.m2132native();
                                                            if (zBilling5 || objM2132native10 == c13863l) {
                                                                C2944l c2944l2 = new C2944l(0, interfaceC4138l7, InterfaceC4138l.class, "launchPermissionRequest", "launchPermissionRequest()V", 0, 0, 3);
                                                                c6956l5.m2147try(c2944l2);
                                                                objM2132native10 = c2944l2;
                                                            }
                                                            c5766l2.m1852instanceof(strPurchase3, strPurchase4, (Function0) ((InterfaceC5059l) objM2132native10), AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2), c6956l5, 0);
                                                        } else {
                                                            c6956l5.m2124else();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 3);
                                    }
                                    boolean z5 = z4;
                                    final InterfaceC2262l interfaceC2262l3 = interfaceC2262l2;
                                    if (!z5) {
                                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-392888432, true, new Cprotected(c5766l2, interfaceC2262l3, context2, 8)), 3);
                                    }
                                    if (!z3) {
                                        AbstractC1757l.appmetrica(c1336l, null, null, AbstractC17860l.purchase, 3);
                                    }
                                    final InterfaceC8714l interfaceC8714l2 = interfaceC8714l;
                                    if (((C13939l) interfaceC8714l2.getValue()).f27228l != null) {
                                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-620109422, true, new Function3() { // from class: lۣؗؒ
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                int i8 = i6;
                                                C13863l c13863l = C1867l.yandex;
                                                C4346l c4346l = C4346l.f8873l;
                                                InterfaceC8714l interfaceC8714l3 = interfaceC8714l2;
                                                InterfaceC2262l interfaceC2262l4 = interfaceC2262l3;
                                                switch (i8) {
                                                    case 0:
                                                        C7091l c7091l = (C7091l) obj7;
                                                        C6956l c6956l4 = (C6956l) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= c6956l4.billing(c7091l) ? 4 : 2;
                                                        }
                                                        if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.as2_scenario_app_launch);
                                                            C7968l c7968l = ((C13939l) interfaceC8714l3.getValue()).f27228l;
                                                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob9 = c6956l4.admob(interfaceC2262l4);
                                                            Object objM2132native9 = c6956l4.m2132native();
                                                            if (zAdmob9 || objM2132native9 == c13863l) {
                                                                objM2132native9 = new C15299l(interfaceC2262l4, 2);
                                                                c6956l4.m2147try(objM2132native9);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_link_outline_28, strPurchase, c7968l, (Function1) objM2132native9, interfaceC17242lVip, c6956l4, 0);
                                                        } else {
                                                            c6956l4.m2124else();
                                                        }
                                                        break;
                                                    case 1:
                                                        C7091l c7091l2 = (C7091l) obj7;
                                                        C6956l c6956l5 = (C6956l) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        if ((iIntValue3 & 6) == 0) {
                                                            iIntValue3 |= c6956l5.billing(c7091l2) ? 4 : 2;
                                                        }
                                                        if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                            String strPurchase2 = AbstractC11999l.purchase(c6956l5, R.string.as2_scenario_headset);
                                                            C7968l c7968l2 = ((C13939l) interfaceC8714l3.getValue()).f27229l;
                                                            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob10 = c6956l5.admob(interfaceC2262l4);
                                                            Object objM2132native10 = c6956l5.m2132native();
                                                            if (zAdmob10 || objM2132native10 == c13863l) {
                                                                objM2132native10 = new C15299l(interfaceC2262l4, 3);
                                                                c6956l5.m2147try(objM2132native10);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_headphones_outline_28, strPurchase2, c7968l2, (Function1) objM2132native10, interfaceC17242lVip2, c6956l5, 0);
                                                        } else {
                                                            c6956l5.m2124else();
                                                        }
                                                        break;
                                                    default:
                                                        C7091l c7091l3 = (C7091l) obj7;
                                                        C6956l c6956l6 = (C6956l) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        if ((iIntValue4 & 6) == 0) {
                                                            iIntValue4 |= c6956l6.billing(c7091l3) ? 4 : 2;
                                                        }
                                                        if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                            String strPurchase3 = AbstractC11999l.purchase(c6956l6, R.string.as2_scenario_bluetooth);
                                                            C7968l c7968l3 = ((C13939l) interfaceC8714l3.getValue()).f27230l;
                                                            InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l3, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob11 = c6956l6.admob(interfaceC2262l4);
                                                            Object objM2132native11 = c6956l6.m2132native();
                                                            if (zAdmob11 || objM2132native11 == c13863l) {
                                                                objM2132native11 = new C15299l(interfaceC2262l4, 1);
                                                                c6956l6.m2147try(objM2132native11);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_bluetooth_outline_28, strPurchase3, c7968l3, (Function1) objM2132native11, interfaceC17242lVip3, c6956l6, 0);
                                                        } else {
                                                            c6956l6.m2124else();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 3);
                                    }
                                    if (((C13939l) interfaceC8714l2.getValue()).f27229l != null) {
                                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-733719917, true, new Function3() { // from class: lۣؗؒ
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                int i8 = i7;
                                                C13863l c13863l = C1867l.yandex;
                                                C4346l c4346l = C4346l.f8873l;
                                                InterfaceC8714l interfaceC8714l3 = interfaceC8714l2;
                                                InterfaceC2262l interfaceC2262l4 = interfaceC2262l3;
                                                switch (i8) {
                                                    case 0:
                                                        C7091l c7091l = (C7091l) obj7;
                                                        C6956l c6956l4 = (C6956l) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= c6956l4.billing(c7091l) ? 4 : 2;
                                                        }
                                                        if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.as2_scenario_app_launch);
                                                            C7968l c7968l = ((C13939l) interfaceC8714l3.getValue()).f27228l;
                                                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob9 = c6956l4.admob(interfaceC2262l4);
                                                            Object objM2132native9 = c6956l4.m2132native();
                                                            if (zAdmob9 || objM2132native9 == c13863l) {
                                                                objM2132native9 = new C15299l(interfaceC2262l4, 2);
                                                                c6956l4.m2147try(objM2132native9);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_link_outline_28, strPurchase, c7968l, (Function1) objM2132native9, interfaceC17242lVip, c6956l4, 0);
                                                        } else {
                                                            c6956l4.m2124else();
                                                        }
                                                        break;
                                                    case 1:
                                                        C7091l c7091l2 = (C7091l) obj7;
                                                        C6956l c6956l5 = (C6956l) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        if ((iIntValue3 & 6) == 0) {
                                                            iIntValue3 |= c6956l5.billing(c7091l2) ? 4 : 2;
                                                        }
                                                        if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                            String strPurchase2 = AbstractC11999l.purchase(c6956l5, R.string.as2_scenario_headset);
                                                            C7968l c7968l2 = ((C13939l) interfaceC8714l3.getValue()).f27229l;
                                                            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob10 = c6956l5.admob(interfaceC2262l4);
                                                            Object objM2132native10 = c6956l5.m2132native();
                                                            if (zAdmob10 || objM2132native10 == c13863l) {
                                                                objM2132native10 = new C15299l(interfaceC2262l4, 3);
                                                                c6956l5.m2147try(objM2132native10);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_headphones_outline_28, strPurchase2, c7968l2, (Function1) objM2132native10, interfaceC17242lVip2, c6956l5, 0);
                                                        } else {
                                                            c6956l5.m2124else();
                                                        }
                                                        break;
                                                    default:
                                                        C7091l c7091l3 = (C7091l) obj7;
                                                        C6956l c6956l6 = (C6956l) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        if ((iIntValue4 & 6) == 0) {
                                                            iIntValue4 |= c6956l6.billing(c7091l3) ? 4 : 2;
                                                        }
                                                        if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                            String strPurchase3 = AbstractC11999l.purchase(c6956l6, R.string.as2_scenario_bluetooth);
                                                            C7968l c7968l3 = ((C13939l) interfaceC8714l3.getValue()).f27230l;
                                                            InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l3, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob11 = c6956l6.admob(interfaceC2262l4);
                                                            Object objM2132native11 = c6956l6.m2132native();
                                                            if (zAdmob11 || objM2132native11 == c13863l) {
                                                                objM2132native11 = new C15299l(interfaceC2262l4, 1);
                                                                c6956l6.m2147try(objM2132native11);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_bluetooth_outline_28, strPurchase3, c7968l3, (Function1) objM2132native11, interfaceC17242lVip3, c6956l6, 0);
                                                        } else {
                                                            c6956l6.m2124else();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 3);
                                    }
                                    if (((C13939l) interfaceC8714l2.getValue()).f27230l != null) {
                                        final int i8 = 2;
                                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-847330412, true, new Function3() { // from class: lۣؗؒ
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                int i9 = i8;
                                                C13863l c13863l = C1867l.yandex;
                                                C4346l c4346l = C4346l.f8873l;
                                                InterfaceC8714l interfaceC8714l3 = interfaceC8714l2;
                                                InterfaceC2262l interfaceC2262l4 = interfaceC2262l3;
                                                switch (i9) {
                                                    case 0:
                                                        C7091l c7091l = (C7091l) obj7;
                                                        C6956l c6956l4 = (C6956l) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if ((iIntValue2 & 6) == 0) {
                                                            iIntValue2 |= c6956l4.billing(c7091l) ? 4 : 2;
                                                        }
                                                        if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                            String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.as2_scenario_app_launch);
                                                            C7968l c7968l = ((C13939l) interfaceC8714l3.getValue()).f27228l;
                                                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob9 = c6956l4.admob(interfaceC2262l4);
                                                            Object objM2132native9 = c6956l4.m2132native();
                                                            if (zAdmob9 || objM2132native9 == c13863l) {
                                                                objM2132native9 = new C15299l(interfaceC2262l4, 2);
                                                                c6956l4.m2147try(objM2132native9);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_link_outline_28, strPurchase, c7968l, (Function1) objM2132native9, interfaceC17242lVip, c6956l4, 0);
                                                        } else {
                                                            c6956l4.m2124else();
                                                        }
                                                        break;
                                                    case 1:
                                                        C7091l c7091l2 = (C7091l) obj7;
                                                        C6956l c6956l5 = (C6956l) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        if ((iIntValue3 & 6) == 0) {
                                                            iIntValue3 |= c6956l5.billing(c7091l2) ? 4 : 2;
                                                        }
                                                        if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                            String strPurchase2 = AbstractC11999l.purchase(c6956l5, R.string.as2_scenario_headset);
                                                            C7968l c7968l2 = ((C13939l) interfaceC8714l3.getValue()).f27229l;
                                                            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob10 = c6956l5.admob(interfaceC2262l4);
                                                            Object objM2132native10 = c6956l5.m2132native();
                                                            if (zAdmob10 || objM2132native10 == c13863l) {
                                                                objM2132native10 = new C15299l(interfaceC2262l4, 3);
                                                                c6956l5.m2147try(objM2132native10);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_headphones_outline_28, strPurchase2, c7968l2, (Function1) objM2132native10, interfaceC17242lVip2, c6956l5, 0);
                                                        } else {
                                                            c6956l5.m2124else();
                                                        }
                                                        break;
                                                    default:
                                                        C7091l c7091l3 = (C7091l) obj7;
                                                        C6956l c6956l6 = (C6956l) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        if ((iIntValue4 & 6) == 0) {
                                                            iIntValue4 |= c6956l6.billing(c7091l3) ? 4 : 2;
                                                        }
                                                        if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                            String strPurchase3 = AbstractC11999l.purchase(c6956l6, R.string.as2_scenario_bluetooth);
                                                            C7968l c7968l3 = ((C13939l) interfaceC8714l3.getValue()).f27230l;
                                                            InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l3, c4346l), 16.0f, 0.0f, 2);
                                                            boolean zAdmob11 = c6956l6.admob(interfaceC2262l4);
                                                            Object objM2132native11 = c6956l6.m2132native();
                                                            if (zAdmob11 || objM2132native11 == c13863l) {
                                                                objM2132native11 = new C15299l(interfaceC2262l4, 1);
                                                                c6956l6.m2147try(objM2132native11);
                                                            }
                                                            c5766l2.m1853public(R.drawable.ic_bluetooth_outline_28, strPurchase3, c7968l3, (Function1) objM2132native11, interfaceC17242lVip3, c6956l6, 0);
                                                        } else {
                                                            c6956l6.m2124else();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 3);
                                    }
                                    List listM4213const = AbstractC16901l.m4213const(((C13939l) interfaceC8714l2.getValue()).f27227l.entrySet());
                                    c1336l.firebase(listM4213const.size(), null, new Creturn(listM4213const, 9, false), new C15578l(802480018, true, new C3127l(listM4213const, c5766l2, interfaceC2262l3, i6)));
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l3.m2147try(function3);
                            objM2132native8 = function3;
                        }
                        AbstractC16336l.yandex(interfaceC17242lCrashlytics, null, interfaceC11780l, c7537l, null, null, false, null, (Function1) objM2132native8, c6956l3, ((iIntValue << 6) & 896) | 24582, 490);
                    } else {
                        c6956l3.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l2), c6956l, 805330992, 237);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18143l(this, i);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m1853public(int i, String str, C7968l c7968l, Function1 function1, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        C6956l c6956l2;
        c6956l.m2133new(-1697888804);
        int i3 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.billing(str) ? 32 : 16) | (c6956l.admob(c7968l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function1) ? 2048 : 1024) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192) | (c6956l.admob(this) ? 131072 : 65536);
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                c6956l.m2123default(24882047);
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = new C0289l(interfaceC8714l, i4);
                    c6956l.m2147try(objM2132native2);
                }
                Function0 function0 = (Function0) objM2132native2;
                int i5 = i3 >> 3;
                m1850finally(function0, c7968l, function1, c6956l, ((i3 >> 6) & 7168) | (i5 & 896) | (i5 & 112) | 6);
                c6956l2 = c6956l;
            } else {
                c6956l2 = c6956l;
                c6956l2.m2123default(9308422);
            }
            c6956l2.startapp(false);
            AbstractC3383l.yandex(interfaceC17242l, null, null, null, null, AbstractC14566l.amazon(370496334, new C14893l(i, str, function1, interfaceC8714l, c7968l), c6956l2), c6956l2, ((i3 >> 12) & 14) | 196608, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(this, i, str, c7968l, function1, interfaceC17242l, i2);
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m1854try(boolean z) {
        this.f12153l.setValue(Boolean.valueOf(z));
    }
}
