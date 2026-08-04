package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lْٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15659l implements InterfaceC15782l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f30611l;

    public C15659l() {
        this.f30611l = new ArrayList(32);
    }

    public void amazon(float f, float f2) {
        this.f30611l.add(new C2789l(f, f2));
    }

    public void billing(float f, float f2) {
        this.f30611l.add(new C16574l(f, f2));
    }

    public void crashlytics(float f) {
        this.f30611l.add(new C3705l(f));
    }

    public void loadAd(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f30611l.add(new C3033l(f, f2, f3, f4, f5, f6));
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lّؗؑ */
    public AbstractC4383l mo1225l() {
        ArrayList arrayList = this.f30611l;
        return ((C4529l) arrayList.get(0)).crashlytics() ? new C14720l(1, arrayList) : new C18446l(arrayList);
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lٍؘؘ */
    public List mo209l() {
        return this.f30611l;
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lٖۥۡ */
    public boolean mo231l() {
        ArrayList arrayList = this.f30611l;
        return arrayList.size() == 1 && ((C4529l) arrayList.get(0)).crashlytics();
    }

    public void mopub(float f, float f2, float f3, float f4) {
        this.f30611l.add(new C18688l(f, f2, f3, f4));
    }

    public void purchase(float f, float f2) {
        this.f30611l.add(new C0550l(f, f2));
    }

    public void yandex() {
        this.f30611l.add(C10766l.crashlytics);
    }

    public C15659l(ArrayList arrayList) {
        this.f30611l = arrayList;
    }
}
