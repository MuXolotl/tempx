package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8028l extends AbstractC5662l {
    public static final /* synthetic */ InterfaceC13922l[] remoteconfig = {new C0544l(AbstractC8028l.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new C0544l(AbstractC8028l.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new C0544l(AbstractC8028l.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    public final C0098l admob;
    public final C10353l amazon;
    public final C0098l billing;
    public final AbstractC8028l crashlytics;
    public final C2278l firebase;
    public final C2278l isPro;
    public final C10038l loadAd;
    public final C18028l mopub;
    public final C2278l purchase;
    public final C0098l smaato;
    public final C2278l subs;

    public AbstractC8028l(C10038l c10038l, C15284l c15284l) {
        this.loadAd = c10038l;
        this.crashlytics = c15284l;
        C16412l c16412l = ((C7757l) c10038l.f20463l).yandex;
        int i = 0;
        C0070l c0070l = new C0070l(this, i);
        c16412l.getClass();
        this.amazon = new C10353l(c16412l, c0070l);
        int i2 = 1;
        C0070l c0070l2 = new C0070l(this, i2);
        c16412l.getClass();
        this.purchase = new C2278l(c16412l, c0070l2);
        this.billing = c16412l.loadAd(new C4846l(this, i));
        this.mopub = c16412l.crashlytics(new C4846l(this, i2));
        int i3 = 2;
        this.admob = c16412l.loadAd(new C4846l(this, i3));
        C0070l c0070l3 = new C0070l(this, i3);
        c16412l.getClass();
        this.subs = new C2278l(c16412l, c0070l3);
        int i4 = 3;
        C0070l c0070l4 = new C0070l(this, i4);
        c16412l.getClass();
        this.isPro = new C2278l(c16412l, c0070l4);
        C0070l c0070l5 = new C0070l(this, 4);
        c16412l.getClass();
        this.firebase = new C2278l(c16412l, c0070l5);
        this.smaato = c16412l.loadAd(new C4846l(this, i4));
    }

    public static C4300l Signature(C10038l c10038l, AbstractC10175l abstractC10175l, List list) {
        C8195l c8195l;
        C3498l c3498l;
        C3498l c3498lPurchase;
        C18449l c18449l = (C18449l) c10038l.f20465l;
        C7757l c7757l = (C7757l) c10038l.f20463l;
        InterfaceC11865l interfaceC11865l = c7757l.metrica;
        C14297l c14297lM4228l = AbstractC16901l.m4228l(list);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14297lM4228l, 10));
        Iterator it = c14297lM4228l.iterator();
        boolean z = false;
        while (true) {
            C14596l c14596l = (C14596l) it;
            if (!c14596l.f28578l.hasNext()) {
                return new C4300l(AbstractC16901l.m4213const(arrayList), z);
            }
            C1143l c1143l = (C1143l) c14596l.next();
            int i = c1143l.yandex;
            C2324l c2324l = (C2324l) c1143l.loadAd;
            C12544l c12544lBilling = AbstractC12081l.billing(c10038l, c2324l);
            C9188l c9188lPurchase = AbstractC1135l.purchase(2, false, null, 7);
            boolean z2 = c2324l.amazon;
            AbstractC11072l abstractC11072l = c2324l.yandex;
            if (z2) {
                C12681l c12681l = abstractC11072l instanceof C12681l ? (C12681l) abstractC11072l : null;
                if (c12681l == null) {
                    C11983l.firebase(c2324l, "Vararg parameter should be an array: ");
                    return null;
                }
                AbstractC14318l abstractC14318lM4542finally = c18449l.m4542finally(c12681l, c9188lPurchase, true);
                c8195l = new C8195l(abstractC14318lM4542finally, interfaceC11865l.subs().billing(abstractC14318lM4542finally));
            } else {
                c8195l = new C8195l(c18449l.m4556this(abstractC11072l, c9188lPurchase), null);
            }
            AbstractC18041l abstractC18041l = (AbstractC18041l) c8195l.f17098l;
            AbstractC18041l abstractC18041l2 = (AbstractC18041l) c8195l.f17097l;
            if (AbstractC8576l.yandex(abstractC10175l.getName().loadAd(), "equals") && list.size() == 1 && interfaceC11865l.subs().metrica().equals(abstractC18041l)) {
                c3498lPurchase = C3498l.purchase("other");
            } else {
                String str = c2324l.crashlytics;
                C3498l c3498lAmazon = str != null ? C3498l.amazon(str) : null;
                if (c3498lAmazon == null) {
                    z = true;
                }
                if (c3498lAmazon == null) {
                    c3498lPurchase = C3498l.purchase("p" + i);
                } else {
                    c3498l = c3498lAmazon;
                }
                arrayList.add(new C17538l(abstractC10175l, null, i, c12544lBilling, c3498l, abstractC18041l, false, false, false, abstractC18041l2, c7757l.isPro.startapp(c2324l)));
            }
            c3498l = c3498lPurchase;
            arrayList.add(new C17538l(abstractC10175l, null, i, c12544lBilling, c3498l, abstractC18041l, false, false, false, abstractC18041l2, c7757l.isPro.startapp(c2324l)));
        }
    }

    public static AbstractC18041l smaato(C1734l c1734l, C10038l c10038l) {
        return ((C18449l) c10038l.f20465l).m4556this(c1734l.billing(), AbstractC1135l.purchase(2, c1734l.yandex().getDeclaringClass().isAnnotation(), null, 6));
    }

    public abstract InterfaceC8371l adcel();

    public abstract Set admob(C18186l c18186l, Function1 function1);

    public boolean ads(C12113l c12113l) {
        return true;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set amazon() {
        InterfaceC13922l interfaceC13922l = remoteconfig[2];
        return (Set) this.firebase.invoke();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        return !mopub().contains(c3498l) ? C2580l.f5619l : (Collection) this.smaato.invoke(c3498l);
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public Collection crashlytics(C18186l c18186l, Function1 function1) {
        return (Collection) this.amazon.invoke();
    }

    public abstract InterfaceC6063l firebase();

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set loadAd() {
        InterfaceC13922l interfaceC13922l = remoteconfig[0];
        return (Set) this.subs.invoke();
    }

    public abstract Set metrica();

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set mopub() {
        InterfaceC13922l interfaceC13922l = remoteconfig[1];
        return (Set) this.isPro.invoke();
    }

    public abstract void remoteconfig(LinkedHashSet linkedHashSet, C3498l c3498l);

    public abstract C7073l startapp();

    public abstract Set subs(C18186l c18186l, C1490l c1490l);

    public abstract C7978l subscription(ArrayList arrayList, AbstractC18041l abstractC18041l, List list);

    public final C12113l tapsense(C1734l c1734l) {
        C10038l c10038l = this.loadAd;
        C1734l c1734l2 = c1734l;
        int i = 1;
        C12113l c12113lM3357l = C12113l.m3357l(adcel(), AbstractC12081l.billing(c10038l, c1734l), c1734l2.crashlytics(), ((C7757l) c10038l.f20463l).isPro.startapp(c1734l), ((InterfaceC6063l) this.purchase.invoke()).loadAd(c1734l2.crashlytics()) != null && ((ArrayList) c1734l.mopub()).isEmpty());
        C10038l c10038lPurchase = AbstractC14460l.purchase(c10038l, c12113lM3357l, c1734l, 0, (InterfaceC1220l) c10038l.f20466l);
        ArrayList typeParameters = c1734l.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC7483l) c10038lPurchase.f20462l).startapp((C16765l) it.next()));
        }
        C4300l c4300lSignature = Signature(c10038lPurchase, c12113lM3357l, c1734l.mopub());
        C7978l c7978lSubscription = subscription(arrayList, smaato(c1734l, c10038lPurchase), c4300lSignature.loadAd);
        List list = c7978lSubscription.amazon;
        C7073l c7073lStartapp = startapp();
        ArrayList arrayList2 = c7978lSubscription.crashlytics;
        List list2 = c7978lSubscription.loadAd;
        AbstractC18041l abstractC18041l = c7978lSubscription.yandex;
        boolean zIsAbstract = Modifier.isAbstract(c1734l2.yandex().getModifiers());
        boolean zIsFinal = Modifier.isFinal(c1734l2.yandex().getModifiers());
        if (zIsAbstract) {
            i = 4;
        } else if (!zIsFinal) {
            i = 3;
        }
        c12113lM3357l.mo3360l(null, c7073lStartapp, C2580l.f5619l, arrayList2, list2, abstractC18041l, i, AbstractC15901l.subs(c1734l2.purchase()), C14054l.f27396l);
        c12113lM3357l.f20716l = Modifier.isNative(c1734l.yandex.getModifiers());
        c12113lM3357l.m3359l(false, c4300lSignature.crashlytics);
        if (list.isEmpty()) {
            return c12113lM3357l;
        }
        ((C7757l) c10038lPurchase.f20463l).purchase.getClass();
        C10754l.ads("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + adcel();
    }

    public abstract void vip(C3498l c3498l, ArrayList arrayList);

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        return !loadAd().contains(c3498l) ? C2580l.f5619l : (Collection) this.admob.invoke(c3498l);
    }

    public void isPro(C3498l c3498l, ArrayList arrayList) {
    }
}
