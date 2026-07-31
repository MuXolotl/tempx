package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8882l {
    public static final float yandex;

    static {
        AbstractC0532l.subs(300, 2, AbstractC5341l.yandex);
        yandex = 22.0f;
    }

    public static final C8954l crashlytics(final Set set, final Function1 function1, C6956l c6956l, int i, int i2) {
        byte b = 0;
        boolean z = true;
        final boolean z2 = (i2 & 32) != 0;
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        boolean zBilling = c6956l.billing(interfaceC13490l) | ((((i & 7168) ^ 3072) > 2048 && c6956l.crashlytics(56.0f)) || (i & 3072) == 2048);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (zBilling || objM2132native == obj) {
            objM2132native = new C4168l(interfaceC13490l, 1);
            c6956l.m2147try(objM2132native);
        }
        final Function0 function0 = (Function0) objM2132native;
        boolean zBilling2 = c6956l.billing(interfaceC13490l) | ((((57344 & i) ^ 24576) > 16384 && c6956l.crashlytics(125.0f)) || (i & 24576) == 16384);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling2 || objM2132native2 == obj) {
            objM2132native2 = new C4168l(interfaceC13490l, 2);
            c6956l.m2147try(objM2132native2);
        }
        final Function0 function2 = (Function0) objM2132native2;
        Object[] objArr = {set, function1, Boolean.valueOf(z2)};
        C13645l c13645l = new C13645l(new C14813l(b, 5), new C18536l(set, function0, function2, function1, z2), 13);
        boolean zAdmob = c6956l.admob(set) | c6956l.billing(function0) | c6956l.billing(function2) | ((((i & 896) ^ 384) > 256 && c6956l.amazon(EnumC9129l.f18765l.ordinal())) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && c6956l.billing(function1)) || (i & 48) == 32);
        if ((((458752 & i) ^ 196608) <= 131072 || !c6956l.mopub(z2)) && (i & 196608) != 131072) {
            z = false;
        }
        boolean z3 = zAdmob | z;
        Object objM2132native3 = c6956l.m2132native();
        if (z3 || objM2132native3 == obj) {
            Object obj2 = new Function0() { // from class: lْؔ٘
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new C8954l(set, function0, function2, EnumC9129l.f18765l, function1, z2);
                }
            };
            c6956l.m2147try(obj2);
            objM2132native3 = obj2;
        }
        return (C8954l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native3, c6956l, 0);
    }

    public static final C8954l loadAd(C6956l c6956l) {
        Set setM2407import = AbstractC8669l.m2407import(new EnumC9129l[]{EnumC9129l.f18765l, EnumC9129l.f18763l, EnumC9129l.f18764l});
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = new C1698l(11);
            c6956l.m2147try(objM2132native);
        }
        return crashlytics(setM2407import, (Function1) objM2132native, c6956l, 384, 56);
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, Function2 function2, C6956l c6956l, int i) {
        c6956l.m2133new(1361920385);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.admob(function2) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            String strCrashlytics = AbstractC7902l.crashlytics(c6956l, R.string.m3c_bottom_sheet_drag_handle_description);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC15645l.amazon(AbstractC1923l.yandex(c6956l, 390), AbstractC14566l.amazon(1497042086, new C12273l(strCrashlytics, 3), c6956l), AbstractC15645l.billing(c6956l), interfaceC17242l, null, false, function2, c6956l, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), 240);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(interfaceC17242l, function2, i, 26);
        }
    }
}
