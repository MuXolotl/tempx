package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17653l {
    public static final C15578l yandex = new C15578l(307633258, false, new C11902l(13));
    public static final C15578l loadAd = new C15578l(1548817674, false, new C11902l(14));
    public static final C15578l crashlytics = new C15578l(1583103019, false, new C10673l(5));
    public static final C15578l amazon = new C15578l(-2091979339, false, new C11902l(15));

    public static Object amazon(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2847l.metrica(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C6597l.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int crashlytics(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return AbstractC5573l.ads((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    public static final List loadAd(InterfaceC10607l interfaceC10607l) {
        List parameters;
        Object next;
        InterfaceC1925l interfaceC1925lMetrica;
        List listIsVip = interfaceC10607l.isVip();
        if (!interfaceC10607l.subscription() && !(interfaceC10607l.Signature() instanceof InterfaceC11661l)) {
            return listIsVip;
        }
        int i = AbstractC3759l.yandex;
        C2100l c2100l = C2100l.f4708l;
        List listAdcel = AbstractC17587l.adcel(new C8767l(AbstractC17587l.firebase(new C17798l(7, AbstractC17587l.isPro(AbstractC17587l.remoteconfig(interfaceC10607l, c2100l), 1)), C12844l.f25256l), C12844l.f25252l, C6657l.f13994l));
        Iterator it = AbstractC17587l.isPro(AbstractC17587l.remoteconfig(interfaceC10607l, c2100l), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC17477l));
        InterfaceC17477l interfaceC17477l = (InterfaceC17477l) next;
        if (interfaceC17477l != null && (interfaceC1925lMetrica = interfaceC17477l.metrica()) != null) {
            parameters = interfaceC1925lMetrica.getParameters();
        }
        if (parameters == null) {
            parameters = C2580l.f5619l;
        }
        if (listAdcel.isEmpty() && parameters.isEmpty()) {
            return interfaceC10607l.isVip();
        }
        ArrayList arrayListM4232new = AbstractC16901l.m4232new(listAdcel, parameters);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListM4232new, 10));
        Iterator it2 = arrayListM4232new.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C7165l((InterfaceC16902l) it2.next(), interfaceC10607l, listIsVip.size()));
        }
        return AbstractC16901l.m4232new(listIsVip, arrayList);
    }

    public static final void purchase(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            AbstractC14825l.yandex("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        AbstractC14825l.yandex("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final C0554l yandex(AbstractC15211l abstractC15211l, InterfaceC10607l interfaceC10607l, int i) {
        InterfaceC10607l interfaceC10607l2 = null;
        if (interfaceC10607l == null || C8741l.purchase(interfaceC10607l)) {
            return null;
        }
        int size = interfaceC10607l.isVip().size() + i;
        if (interfaceC10607l.subscription()) {
            List listSubList = abstractC15211l.inmobi().subList(i, size);
            InterfaceC8371l interfaceC8371lSignature = interfaceC10607l.Signature();
            return new C0554l(interfaceC10607l, listSubList, yandex(abstractC15211l, interfaceC8371lSignature instanceof InterfaceC10607l ? (InterfaceC10607l) interfaceC8371lSignature : null, size));
        }
        if (size != abstractC15211l.inmobi().size()) {
            AbstractC11125l.remoteconfig(interfaceC10607l);
        }
        return new C0554l(interfaceC10607l, abstractC15211l.inmobi().subList(i, abstractC15211l.inmobi().size()), interfaceC10607l2);
    }
}
