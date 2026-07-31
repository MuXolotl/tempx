package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9539l extends AbstractC0601l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ int f19441l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1220l f19442l = AbstractC9968l.crashlytics(2, new C9908l(this, 0));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Class f19443l;

    public C9539l(Class cls) {
        this.f19443l = cls;
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: case */
    public final Collection mo654case() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: class */
    public final C6084l mo656class(int i) {
        C1571l c1571l = (C1571l) AbstractC16901l.m4236public((List) ((C11400l) this.f19442l.getValue()).crashlytics.getValue());
        if (c1571l == null) {
            return null;
        }
        ArrayList arrayList = ((C12677l) AbstractC11048l.amazon(c1571l.amazon, C12677l.loadAd)).yandex;
        if (arrayList != null) {
            return (C6084l) AbstractC16901l.m4220for(i, arrayList);
        }
        return null;
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: continue */
    public final InterfaceC10696l mo657continue(int i) {
        C2343l c2343l = ((C11400l) this.f19442l.getValue()).purchase;
        InterfaceC13922l interfaceC13922l = C11400l.admob[1];
        InterfaceC7637l interfaceC7637l = (InterfaceC7637l) c2343l.invoke();
        C12181l c12181l = interfaceC7637l instanceof C12181l ? (C12181l) interfaceC7637l : null;
        if (c12181l != null) {
            C7644l c7644l = c12181l.loadAd;
            C5665l c5665l = c12181l.admob;
            C13146l c13146l = (C13146l) AbstractC0714l.crashlytics(c5665l, AbstractC8450l.smaato, i);
            if (c13146l != null) {
                return (InterfaceC10696l) AbstractC5592l.purchase(this.f19443l, new C1228l(this), c13146l, (InterfaceC3588l) c7644l.f15737l, new C14965l(c5665l.f12047l), (AbstractC12974l) c7644l.f15742l, C15460l.f30251l);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9539l) {
            return AbstractC8576l.yandex(this.f19443l, ((C9539l) obj).f19443l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19443l.hashCode();
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: interface */
    public final Class mo660interface() {
        Class cls = (Class) ((C11400l) this.f19442l.getValue()).billing.getValue();
        return cls == null ? this.f19443l : cls;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final ArrayList m2678new() {
        List list = (List) ((C11400l) this.f19442l.getValue()).crashlytics.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(arrayList, ((C1571l) it.next()).yandex);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC13937l
    /* JADX INFO: renamed from: private */
    public final Class mo1730private() {
        return this.f19443l;
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: static */
    public final Collection mo661static(C3498l c3498l) {
        C2343l c2343l = ((C11400l) this.f19442l.getValue()).purchase;
        InterfaceC13922l interfaceC13922l = C11400l.admob[1];
        return ((InterfaceC7637l) c2343l.invoke()).billing(c3498l, EnumC11300l.f22776l);
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: switch */
    public final Collection mo662switch(C3498l c3498l) {
        C2343l c2343l = ((C11400l) this.f19442l.getValue()).purchase;
        InterfaceC13922l interfaceC13922l = C11400l.admob[1];
        return ((InterfaceC7637l) c2343l.invoke()).yandex(c3498l, EnumC11300l.f22776l);
    }

    public final String toString() {
        return "file class " + AbstractC1845l.yandex(this.f19443l).yandex();
    }
}
