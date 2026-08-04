package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌِؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4763l extends AbstractC8168l {
    public static final /* synthetic */ int startapp = 0;
    public final C18174l metrica;
    public final C12875l vip;

    public C4763l(C10038l c10038l, C12875l c12875l, C18174l c18174l) {
        super(c10038l, null);
        this.vip = c12875l;
        this.metrica = c18174l;
    }

    public static InterfaceC10696l license(InterfaceC10696l interfaceC10696l) {
        if (interfaceC10696l.mo367while() != 2) {
            return interfaceC10696l;
        }
        Collection collectionLicense = interfaceC10696l.license();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionLicense, 10));
        Iterator it = collectionLicense.iterator();
        while (it.hasNext()) {
            arrayList.add(license((InterfaceC10696l) it.next()));
        }
        return (InterfaceC10696l) AbstractC16901l.m4208abstract(AbstractC16901l.m4245throws(arrayList));
    }

    @Override // defpackage.AbstractC8028l
    public final InterfaceC8371l adcel() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC8028l
    public final Set admob(C18186l c18186l, Function1 function1) {
        return C5746l.f12138l;
    }

    @Override // defpackage.AbstractC8028l
    public final InterfaceC6063l firebase() {
        return new C6258l(this.vip, C1490l.f3728l);
    }

    @Override // defpackage.AbstractC8028l
    public final void isPro(C3498l c3498l, ArrayList arrayList) {
        ((C13772l) ((C7757l) this.loadAd.f20463l).ad).getClass();
    }

    @Override // defpackage.AbstractC8028l
    public final Set metrica() {
        Set setM4227l = AbstractC16901l.m4227l(((InterfaceC6063l) this.purchase.invoke()).billing());
        C1490l c1490l = C1490l.f3721l;
        C18174l c18174l = this.metrica;
        AbstractC3739l.crashlytics(Collections.singletonList(c18174l), C18450l.f36019l, new C6094l(c18174l, setM4227l, c1490l));
        if (this.vip.yandex.isEnum()) {
            setM4227l.add(AbstractC3974l.loadAd);
        }
        return setM4227l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        return null;
    }

    @Override // defpackage.AbstractC8028l
    public final void remoteconfig(LinkedHashSet linkedHashSet, C3498l c3498l) {
        Collection collectionM4229l;
        C18174l c18174l = this.metrica;
        C4763l c4763lCrashlytics = AbstractC16947l.crashlytics(c18174l);
        if (c4763lCrashlytics == null) {
            collectionM4229l = C5746l.f12138l;
        } else {
            collectionM4229l = AbstractC16901l.m4229l(!c4763lCrashlytics.loadAd().contains(c3498l) ? C2580l.f5619l : (Collection) c4763lCrashlytics.admob.invoke(c3498l));
        }
        Collection collection = collectionM4229l;
        C7757l c7757l = (C7757l) this.loadAd.f20463l;
        linkedHashSet.addAll(AbstractC11621l.isPro(c3498l, collection, linkedHashSet, this.metrica, c7757l.billing, ((C5215l) c7757l.Signature).amazon));
        if (this.vip.yandex.isEnum()) {
            if (c3498l.equals(AbstractC3974l.crashlytics)) {
                linkedHashSet.add(AbstractC6689l.subs(c18174l));
            } else if (c3498l.equals(AbstractC3974l.yandex)) {
                linkedHashSet.add(AbstractC6689l.isPro(c18174l));
            }
        }
    }

    @Override // defpackage.AbstractC8028l
    public final Set subs(C18186l c18186l, C1490l c1490l) {
        Set setM4227l = AbstractC16901l.m4227l(((InterfaceC6063l) this.purchase.invoke()).yandex());
        C4763l c4763lCrashlytics = AbstractC16947l.crashlytics(this.metrica);
        Set setLoadAd = c4763lCrashlytics != null ? c4763lCrashlytics.loadAd() : null;
        if (setLoadAd == null) {
            setLoadAd = C5746l.f12138l;
        }
        setM4227l.addAll(setLoadAd);
        if (this.vip.yandex.isEnum()) {
            setM4227l.addAll(AbstractC14055l.remoteconfig(AbstractC3974l.crashlytics, AbstractC3974l.yandex));
        }
        ((C13772l) ((C7757l) this.loadAd.f20463l).ad).getClass();
        setM4227l.addAll(new ArrayList());
        return setM4227l;
    }

    @Override // defpackage.AbstractC8168l, defpackage.AbstractC8028l
    public final void vip(C3498l c3498l, ArrayList arrayList) {
        ArrayList arrayList2;
        C3498l c3498l2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C6238l c6238l = new C6238l(23, c3498l);
        C18174l c18174l = this.metrica;
        AbstractC3739l.crashlytics(Collections.singletonList(c18174l), C18450l.f36019l, new C6094l(c18174l, linkedHashSet, c6238l));
        boolean zIsEmpty = arrayList.isEmpty();
        C10038l c10038l = this.loadAd;
        if (zIsEmpty) {
            C3498l c3498l3 = c3498l;
            arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC10696l interfaceC10696lLicense = license((InterfaceC10696l) obj);
                Object arrayList3 = linkedHashMap.get(interfaceC10696lLicense);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(interfaceC10696lLicense, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C7757l c7757l = (C7757l) c10038l.f20463l;
                C3498l c3498l4 = c3498l3;
                AbstractC3984l.license(arrayList4, AbstractC11621l.isPro(c3498l4, collection, arrayList2, this.metrica, c7757l.billing, ((C5215l) c7757l.Signature).amazon));
                c3498l3 = c3498l4;
            }
            c3498l2 = c3498l3;
            arrayList2.addAll(arrayList4);
        } else {
            C7757l c7757l2 = (C7757l) c10038l.f20463l;
            arrayList2 = arrayList;
            arrayList2.addAll(AbstractC11621l.isPro(c3498l, linkedHashSet, arrayList, this.metrica, c7757l2.billing, ((C5215l) c7757l2.Signature).amazon));
            c3498l2 = c3498l;
        }
        if (this.vip.yandex.isEnum() && c3498l2.equals(AbstractC3974l.loadAd)) {
            AbstractC3324l.crashlytics(arrayList2, AbstractC6689l.admob(c18174l));
        }
    }
}
