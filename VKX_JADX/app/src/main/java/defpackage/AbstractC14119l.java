package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lْٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14119l implements InterfaceC12997l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f27617l;

    public AbstractC14119l(int i) {
        switch (i) {
            case 1:
                this.f27617l = new ArrayList();
                break;
            default:
                this.f27617l = new ArrayList();
                break;
        }
    }

    @Override // defpackage.InterfaceC12997l
    /* JADX INFO: renamed from: abstract */
    public void mo2836abstract() {
        amazon((String[]) this.f27617l.toArray(new String[0]));
    }

    public abstract void amazon(String[] strArr);

    public void crashlytics(int i, Object obj, AbstractC2155l abstractC2155l, Object obj2) {
        if (AbstractC8576l.yandex(obj, C1867l.yandex)) {
            loadAd(i, abstractC2155l, null);
        }
    }

    public void loadAd(int i, AbstractC2155l abstractC2155l, Object obj) {
        this.f27617l.add(new C15253l(i, null, null));
    }

    @Override // defpackage.InterfaceC12997l
    public InterfaceC14209l purchase(C3624l c3624l) {
        return null;
    }

    @Override // defpackage.InterfaceC12997l
    public void tapsense(Object obj) {
        if (obj instanceof String) {
            this.f27617l.add((String) obj);
        }
    }

    public boolean yandex(int i, AbstractC2155l abstractC2155l, Object obj) {
        ArrayList arrayList = abstractC2155l.yandex;
        if (arrayList == null) {
            loadAd(i, abstractC2155l, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof C12317l)) {
                if (!(obj2 instanceof AbstractC2155l)) {
                    C17132l.metrica(obj2, "Unexpected child source info ");
                    break;
                }
                if (yandex(i, (AbstractC2155l) obj2, obj)) {
                    loadAd(0, abstractC2155l, obj2);
                    return true;
                }
            } else if (obj2.equals(obj)) {
                loadAd(0, abstractC2155l, obj2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC12997l
    /* JADX INFO: renamed from: private */
    public void mo2856private(C14700l c14700l) {
    }

    @Override // defpackage.InterfaceC12997l
    public void license(C3624l c3624l, C3498l c3498l) {
    }
}
