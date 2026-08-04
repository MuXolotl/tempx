package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؔۤٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3017l {
    public static final C8540l yandex = new C8540l(C5617l.f11951l);
    public static final C8540l loadAd = new C8540l(C5617l.f11959l);

    public static final boolean loadAd(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0225  */
    /* JADX WARN: Code duplicated, block: B:103:0x0229  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fd  */
    public static final void yandex(InterfaceC16711l interfaceC16711l, Function0 function0, C12288l c12288l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        Function0 function1;
        C12288l c12288l2;
        boolean z;
        Function0 function2;
        C4224l c4224lAds;
        Function0 function3;
        View view;
        InterfaceC13490l interfaceC13490l;
        String str;
        EnumC9931l enumC9931l;
        C14112l c14112lMopub;
        InterfaceC8714l interfaceC8714lVip;
        Object objM2132native;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objM2132native2;
        int i4;
        String str2;
        boolean z2;
        C11941l c11941l;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zBilling;
        Object objM2132native3;
        boolean z5;
        boolean z6;
        boolean zBilling2;
        Object objM2132native4;
        boolean z7;
        boolean z8;
        Object obj3;
        boolean zAdmob;
        Object obj4;
        boolean zAdmob2;
        int i7;
        Object obj5;
        boolean zAdmob3;
        Object obj6;
        Function0 function4;
        int i8;
        int i9;
        InterfaceC16711l interfaceC16711l2 = interfaceC16711l;
        c6956l.m2133new(-1772091631);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(interfaceC16711l2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= c6956l.admob(function1) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                c12288l2 = c12288l;
                if (c6956l.billing(c12288l2)) {
                    i9 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            } else {
                c12288l2 = c12288l;
            }
            if ((i & 3072) == 0) {
                if (c6956l.admob(c15578l)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i3 & 1, z)) {
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                view = (View) c6956l.isPro(AbstractC1242l.billing);
                interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
                str = (String) c6956l.isPro(yandex);
                enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
                c14112lMopub = AbstractC8238l.mopub(c6956l);
                interfaceC8714lVip = AbstractC8020l.vip(c15578l, c6956l);
                Object[] objArr = new Object[0];
                objM2132native = c6956l.m2132native();
                obj = C1867l.yandex;
                obj2 = objM2132native;
                if (objM2132native == obj) {
                    Object obj7 = C5617l.f11961l;
                    c6956l.m2147try(obj7);
                    obj2 = obj7;
                }
                uuid = (UUID) AbstractC0825l.firebase(objArr, (Function0) obj2, c6956l);
                zBooleanValue = ((Boolean) c6956l.isPro(loadAd)).booleanValue();
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj) {
                    i4 = i3;
                    z2 = true;
                    str2 = str;
                    C11941l c11941l2 = new C11941l(function3, c12288l2, str2, view, interfaceC13490l, interfaceC16711l2, uuid, zBooleanValue);
                    interfaceC16711l2 = interfaceC16711l2;
                    c11941l2.vip(c14112lMopub, new C15578l(-297523940, true, new C1450l(c11941l2, interfaceC8714lVip, true ? 1 : 0)));
                    c6956l.m2147try(c11941l2);
                    objM2132native2 = c11941l2;
                } else {
                    i4 = i3;
                    str2 = str;
                    z2 = true;
                }
                c11941l = (C11941l) objM2132native2;
                boolean zAdmob4 = c6956l.admob(c11941l);
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z9 = zAdmob4 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zBilling = z9 | z4 | c6956l.billing(str2) | c6956l.amazon(enumC9931l.ordinal());
                objM2132native3 = c6956l.m2132native();
                if (zBilling || objM2132native3 == obj) {
                    Object c4879l = new C4879l(c11941l, function3, c12288l, str2, enumC9931l, 0);
                    c6956l.m2147try(c4879l);
                    objM2132native3 = c4879l;
                }
                AbstractC12311l.loadAd(c11941l, (Function1) objM2132native3, c6956l);
                boolean zAdmob5 = c6956l.admob(c11941l);
                if (i5 == 32) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z10 = zAdmob5 | z5;
                if (i6 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                zBilling2 = z10 | z6 | c6956l.billing(str2) | c6956l.amazon(enumC9931l.ordinal());
                objM2132native4 = c6956l.m2132native();
                if (zBilling2 || objM2132native4 == obj) {
                    Object c11574l = new C11574l(c11941l, function3, c12288l, str2, enumC9931l);
                    c6956l.m2147try(c11574l);
                    objM2132native4 = c11574l;
                }
                AbstractC12311l.billing((Function0) objM2132native4, c6956l);
                boolean zAdmob6 = c6956l.admob(c11941l);
                if ((i4 & 14) == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                z8 = zAdmob6 | z7;
                Object objM2132native5 = c6956l.m2132native();
                obj3 = objM2132native5;
                if (z8 == 0 || objM2132native5 == obj) {
                    Object c2977l = new C2977l(c11941l, interfaceC16711l2, 2);
                    c6956l.m2147try(c2977l);
                    obj3 = c2977l;
                }
                AbstractC12311l.loadAd(interfaceC16711l2, (Function1) obj3, c6956l);
                zAdmob = c6956l.admob(c11941l);
                Object objM2132native6 = c6956l.m2132native();
                obj4 = objM2132native6;
                if (zAdmob || objM2132native6 == obj) {
                    Object c12086l = new C12086l(c11941l, null, 8);
                    c6956l.m2147try(c12086l);
                    obj4 = c12086l;
                }
                AbstractC12311l.amazon(c6956l, c11941l, (Function2) obj4);
                zAdmob2 = c6956l.admob(c11941l);
                Object objM2132native7 = c6956l.m2132native();
                if (!zAdmob2 || objM2132native7 == obj) {
                    i7 = 0;
                    Object c13984l = new C13984l(c11941l, 0);
                    c6956l.m2147try(c13984l);
                    obj5 = c13984l;
                } else {
                    i7 = 0;
                    obj5 = objM2132native7;
                }
                InterfaceC17242l interfaceC17242lBilling = AbstractC8238l.billing(C4346l.f8873l, (Function1) obj5);
                zAdmob3 = c6956l.admob(c11941l) | c6956l.amazon(enumC9931l.ordinal());
                Object objM2132native8 = c6956l.m2132native();
                obj6 = objM2132native8;
                if (zAdmob3 || objM2132native8 == obj) {
                    Object c7096l = new C7096l(c11941l, enumC9931l, i7);
                    c6956l.m2147try(c7096l);
                    obj6 = c7096l;
                }
                InterfaceC10835l interfaceC10835l = (InterfaceC10835l) obj6;
                long j = c6956l.f14595continue;
                int i11 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lBilling);
                InterfaceC8801l.firebase.getClass();
                function4 = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function4);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i11), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                c6956l.startapp(z2);
                function2 = function3;
            } else {
                c6956l.m2124else();
                function2 = function1;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C7612l(interfaceC16711l2, function2, c12288l, c15578l, i, i2, 0);
            }
        }
        i3 |= 48;
        function1 = function0;
        if ((i & 384) == 0) {
            c12288l2 = c12288l;
            if (c6956l.billing(c12288l2)) {
                i9 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            c12288l2 = c12288l;
        }
        if ((i & 3072) == 0) {
            if (c6956l.admob(c15578l)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i3 & 1, z)) {
            if (i10 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            view = (View) c6956l.isPro(AbstractC1242l.billing);
            interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
            str = (String) c6956l.isPro(yandex);
            enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
            c14112lMopub = AbstractC8238l.mopub(c6956l);
            interfaceC8714lVip = AbstractC8020l.vip(c15578l, c6956l);
            Object[] objArr2 = new Object[0];
            objM2132native = c6956l.m2132native();
            obj = C1867l.yandex;
            obj2 = objM2132native;
            if (objM2132native == obj) {
                Object obj8 = C5617l.f11961l;
                c6956l.m2147try(obj8);
                obj2 = obj8;
            }
            uuid = (UUID) AbstractC0825l.firebase(objArr2, (Function0) obj2, c6956l);
            zBooleanValue = ((Boolean) c6956l.isPro(loadAd)).booleanValue();
            objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                i4 = i3;
                z2 = true;
                str2 = str;
                C11941l c11941l3 = new C11941l(function3, c12288l2, str2, view, interfaceC13490l, interfaceC16711l2, uuid, zBooleanValue);
                interfaceC16711l2 = interfaceC16711l2;
                c11941l3.vip(c14112lMopub, new C15578l(-297523940, true, new C1450l(c11941l3, interfaceC8714lVip, true ? 1 : 0)));
                c6956l.m2147try(c11941l3);
                objM2132native2 = c11941l3;
            } else {
                i4 = i3;
                str2 = str;
                z2 = true;
            }
            c11941l = (C11941l) objM2132native2;
            boolean zAdmob7 = c6956l.admob(c11941l);
            i5 = i4 & 112;
            if (i5 == 32) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z11 = zAdmob7 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = z2;
            } else {
                z4 = false;
            }
            zBilling = z11 | z4 | c6956l.billing(str2) | c6956l.amazon(enumC9931l.ordinal());
            objM2132native3 = c6956l.m2132native();
            if (zBilling) {
                Object c4879l2 = new C4879l(c11941l, function3, c12288l, str2, enumC9931l, 0);
                c6956l.m2147try(c4879l2);
                objM2132native3 = c4879l2;
            } else {
                Object c4879l3 = new C4879l(c11941l, function3, c12288l, str2, enumC9931l, 0);
                c6956l.m2147try(c4879l3);
                objM2132native3 = c4879l3;
            }
            AbstractC12311l.loadAd(c11941l, (Function1) objM2132native3, c6956l);
            boolean zAdmob8 = c6956l.admob(c11941l);
            if (i5 == 32) {
                z5 = z2;
            } else {
                z5 = false;
            }
            boolean z12 = zAdmob8 | z5;
            if (i6 == 256) {
                z6 = z2;
            } else {
                z6 = false;
            }
            zBilling2 = z12 | z6 | c6956l.billing(str2) | c6956l.amazon(enumC9931l.ordinal());
            objM2132native4 = c6956l.m2132native();
            if (zBilling2) {
                Object c11574l2 = new C11574l(c11941l, function3, c12288l, str2, enumC9931l);
                c6956l.m2147try(c11574l2);
                objM2132native4 = c11574l2;
            } else {
                Object c11574l3 = new C11574l(c11941l, function3, c12288l, str2, enumC9931l);
                c6956l.m2147try(c11574l3);
                objM2132native4 = c11574l3;
            }
            AbstractC12311l.billing((Function0) objM2132native4, c6956l);
            boolean zAdmob9 = c6956l.admob(c11941l);
            if ((i4 & 14) == 4) {
                z7 = z2;
            } else {
                z7 = false;
            }
            z8 = zAdmob9 | z7;
            Object objM2132native9 = c6956l.m2132native();
            obj3 = objM2132native9;
            if (z8 == 0) {
                Object c2977l2 = new C2977l(c11941l, interfaceC16711l2, 2);
                c6956l.m2147try(c2977l2);
                obj3 = c2977l2;
            } else {
                Object c2977l3 = new C2977l(c11941l, interfaceC16711l2, 2);
                c6956l.m2147try(c2977l3);
                obj3 = c2977l3;
            }
            AbstractC12311l.loadAd(interfaceC16711l2, (Function1) obj3, c6956l);
            zAdmob = c6956l.admob(c11941l);
            Object objM2132native10 = c6956l.m2132native();
            obj4 = objM2132native10;
            if (zAdmob) {
                Object c12086l2 = new C12086l(c11941l, null, 8);
                c6956l.m2147try(c12086l2);
                obj4 = c12086l2;
            } else {
                Object c12086l3 = new C12086l(c11941l, null, 8);
                c6956l.m2147try(c12086l3);
                obj4 = c12086l3;
            }
            AbstractC12311l.amazon(c6956l, c11941l, (Function2) obj4);
            zAdmob2 = c6956l.admob(c11941l);
            Object objM2132native11 = c6956l.m2132native();
            if (zAdmob2) {
                i7 = 0;
                Object c13984l2 = new C13984l(c11941l, 0);
                c6956l.m2147try(c13984l2);
                obj5 = c13984l2;
            } else {
                i7 = 0;
                Object c13984l3 = new C13984l(c11941l, 0);
                c6956l.m2147try(c13984l3);
                obj5 = c13984l3;
            }
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC8238l.billing(C4346l.f8873l, (Function1) obj5);
            zAdmob3 = c6956l.admob(c11941l) | c6956l.amazon(enumC9931l.ordinal());
            Object objM2132native12 = c6956l.m2132native();
            obj6 = objM2132native12;
            if (zAdmob3) {
                Object c7096l2 = new C7096l(c11941l, enumC9931l, i7);
                c6956l.m2147try(c7096l2);
                obj6 = c7096l2;
            } else {
                Object c7096l3 = new C7096l(c11941l, enumC9931l, i7);
                c6956l.m2147try(c7096l3);
                obj6 = c7096l3;
            }
            InterfaceC10835l interfaceC10835l2 = (InterfaceC10835l) obj6;
            long j2 = c6956l.f14595continue;
            int i12 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lBilling3);
            InterfaceC8801l.firebase.getClass();
            function4 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function4);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835l2, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i12), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, C3438l.amazon);
            c6956l.startapp(z2);
            function2 = function3;
        } else {
            c6956l.m2124else();
            function2 = function1;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7612l(interfaceC16711l2, function2, c12288l, c15578l, i, i2, 0);
        }
    }
}
