package defpackage;

import android.graphics.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0072l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final List f976l = AbstractC14055l.remoteconfig(new C15093l(new C8195l(Integer.valueOf(R.string.te_c_bg), AbstractC14055l.remoteconfig(new C9229l(new C12823l("windowBackground", Integer.valueOf(R.string.te_bg), Integer.valueOf(android.R.attr.windowBackground))), new C9229l(new C12823l("bg_primary", Integer.valueOf(R.string.te_prim), Integer.valueOf(R.attr.bg_primary))), new C9229l(new C12823l("nextdock_background", Integer.valueOf(R.string.te_dock), Integer.valueOf(R.attr.nextdock_background)))))), new C15093l(new C8195l(Integer.valueOf(R.string.te_c_acc), Collections.singletonList(new C9229l(new C12823l("global_accent", Integer.valueOf(R.string.te_acc), Integer.valueOf(R.attr.global_accent)))))), new C15093l(new C8195l(Integer.valueOf(R.string.te_c_txt), AbstractC14055l.remoteconfig(new C9229l(new C12823l("text_primary", Integer.valueOf(R.string.te_text_prim), Integer.valueOf(R.attr.text_primary))), new C9229l(new C12823l("text_secondary", Integer.valueOf(R.string.te_text_seco), Integer.valueOf(R.attr.text_secondary)))))));

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final void m269abstract(C0072l c0072l) {
        AbstractC13209l.loadAd(AbstractC8733l.yandex(), new float[]{0.0f, 0.0f}, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m270import(C12823l c12823l, Function1 function1, Function1 function2, C6956l c6956l, int i) {
        int i2;
        char c;
        Object c9735l;
        int i3;
        int i4;
        Object obj;
        long j;
        C6956l c6956l2;
        C12823l c12823l2 = c12823l;
        C6956l c6956l3 = c6956l;
        Object obj2 = c12823l2.f25200l;
        c6956l3.m2133new(-2090883031);
        int i5 = i | (c6956l3.billing(c12823l2) ? 4 : 2) | (c6956l3.admob(function1) ? 32 : 16) | (c6956l3.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l3.admob(this) ? 2048 : 1024);
        if (c6956l3.m2127for(i5 & 1, (i5 & 1171) != 1170)) {
            Object objM2132native = c6956l3.m2132native();
            Object obj3 = C1867l.yandex;
            if (objM2132native == obj3) {
                objM2132native = AbstractC12311l.isPro(c6956l3);
                c6956l3.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            Object objM2132native2 = c6956l3.m2132native();
            if (objM2132native2 == obj3) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l3.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
            Object objM2132native3 = c6956l3.m2132native();
            if (objM2132native3 == obj3) {
                objM2132native3 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l3.m2147try(objM2132native3);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
            Object obj4 = (C0764l) ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).crashlytics.getValue();
            boolean zBilling = c6956l3.billing(obj4);
            Object objM2132native4 = c6956l3.m2132native();
            if (zBilling || objM2132native4 == obj3) {
                i2 = 2;
                c = 0;
                c9735l = new C9735l(AbstractC12953l.loadAd(AbstractC13209l.yandex(((Number) c12823l2.f25198l).intValue())));
                c6956l3.m2147try(c9735l);
            } else {
                c9735l = objM2132native4;
                i2 = 2;
                c = 0;
            }
            long jLoadAd = ((C9735l) c9735l).yandex;
            boolean zBilling2 = c6956l3.billing(obj4);
            int i6 = i2;
            Object objM2132native5 = c6956l3.m2132native();
            if (zBilling2 || objM2132native5 == obj3) {
                objM2132native5 = Integer.valueOf(((Number) function1.invoke((String) obj2)).intValue());
                c6956l3.m2147try(objM2132native5);
            }
            int iIntValue = ((Number) objM2132native5).intValue();
            boolean zBilling3 = c6956l3.billing(obj4);
            Object objM2132native6 = c6956l3.m2132native();
            if (zBilling3 || objM2132native6 == obj3) {
                objM2132native6 = (String) function2.invoke((String) obj2);
                c6956l3.m2147try(objM2132native6);
            }
            Object obj5 = (String) objM2132native6;
            boolean z = iIntValue != Integer.MAX_VALUE ? 1 : c;
            boolean zMopub = c6956l3.mopub(z) | c6956l3.amazon(iIntValue) | c6956l3.billing(obj5);
            Object objM2132native7 = c6956l3.m2132native();
            if (zMopub || objM2132native7 == obj3) {
                if (z != 0) {
                    jLoadAd = AbstractC12953l.loadAd(iIntValue);
                }
                objM2132native7 = new C9735l(jLoadAd);
                c6956l3.m2147try(objM2132native7);
            }
            long j2 = ((C9735l) objM2132native7).yandex;
            boolean zPurchase = c6956l3.purchase(j2);
            Object objM2132native8 = c6956l3.m2132native();
            if (zPurchase || objM2132native8 == obj3) {
                C13645l c13645l = C12818l.purchase;
                objM2132native8 = AbstractC8020l.smaato(AbstractC2133l.admob(j2));
                c6956l3.m2147try(objM2132native8);
            }
            InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) objM2132native8;
            boolean zBilling4 = c6956l3.billing((C12818l) interfaceC8714l3.getValue());
            Object objM2132native9 = c6956l3.m2132native();
            char c2 = 3;
            if (zBilling4 || objM2132native9 == obj3) {
                C12818l c12818l = (C12818l) interfaceC8714l3.getValue();
                int i7 = (int) (c12818l.amazon * 255.0f);
                float f = c12818l.yandex;
                float f2 = c12818l.loadAd;
                float f3 = c12818l.crashlytics;
                float[] fArr = new float[3];
                fArr[c] = f;
                fArr[1] = f2;
                fArr[i6] = f3;
                Integer numValueOf = Integer.valueOf(Color.HSVToColor(i7, fArr) & 16777215);
                i3 = 1;
                Object[] objArr = new Object[1];
                objArr[c] = numValueOf;
                objM2132native9 = AbstractC8020l.smaato(String.format("%06X", Arrays.copyOf(objArr, 1)));
                c6956l3.m2147try(objM2132native9);
            } else {
                i3 = 1;
            }
            InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) objM2132native9;
            if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                c6956l3.m2123default(415800502);
                Object objM2132native10 = c6956l3.m2132native();
                if (objM2132native10 == obj3) {
                    objM2132native10 = new C1528l(interfaceC8714l, i6);
                    c6956l3.m2147try(objM2132native10);
                }
                C6340l c6340l = new C6340l(this, interfaceC8714l4, interfaceC8714l3, interfaceC2262l, c12823l, interfaceC8714l2, interfaceC8714l);
                interfaceC8714l = interfaceC8714l;
                C15578l c15578lAmazon = AbstractC14566l.amazon(-1716200010, c6340l, c6956l3);
                c12823l2 = c12823l;
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(-1724198984, new C6340l(interfaceC2262l, c12823l2, this, interfaceC8714l4, interfaceC8714l3, interfaceC8714l, interfaceC8714l2), c6956l3);
                C15578l c15578lAmazon3 = AbstractC14566l.amazon(-1732197958, new Cthis(c12823l2, 2), c6956l3);
                C15578l c15578lAmazon4 = AbstractC14566l.amazon(411286203, new C3411l(interfaceC8714l4, interfaceC8714l2, interfaceC8714l3, 13), c6956l3);
                i4 = i3;
                obj = obj3;
                j = j2;
                AbstractC16291l.yandex((Function0) objM2132native10, c15578lAmazon, null, c15578lAmazon2, null, c15578lAmazon3, c15578lAmazon4, null, 0L, 0L, 0L, 0L, null, c6956l3, 1772598, 0, 16276);
                c6956l2 = c6956l3;
            } else {
                i4 = i3;
                obj = obj3;
                j = j2;
                c6956l3.m2123default(404319993);
                c6956l2 = c6956l3;
            }
            c6956l2.startapp(c);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            Object objM2132native11 = c6956l2.m2132native();
            if (objM2132native11 == obj) {
                objM2132native11 = new C1528l(interfaceC8714l, c2);
                c6956l2.m2147try(objM2132native11);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-990777205, new Cthis(c12823l2, c2), c6956l2), AbstractC9151l.loadAd(interfaceC17242lAmazon, c, null, (Function0) objM2132native11, 15), null, AbstractC14566l.amazon(1251499176, new C7371l(z, obj5, 11), c6956l2), null, AbstractC14566l.amazon(-116961434, new C7248l(j, i4), c6956l2), null, c6956l2, 199686, 468);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(this, c12823l2, function1, function2, i, 26);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-2006811304);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3601l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3601l;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1024785428, new C2736l(c13072lYandex, this, 17), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1460847383, new C11223l((Object) c13072lYandex, (Object) interfaceC2262l, (Object) AbstractC3700l.loadAd(interfaceC6942lYandex, (C15343l) ((AbstractC11904l) C6546l.f13666l.f33214l), c6956l, 0), (Object) this, 27), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14222l(this, i);
        }
    }
}
