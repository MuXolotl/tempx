package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًٍٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7893l extends AbstractC9813l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f16464l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f16465l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16936l f16466l;

    public C7893l(C16936l c16936l, C10227l c10227l, ArrayList arrayList, C4974l c4974l) {
        if (c4974l.loadAd != arrayList.size() + 1) {
            C8339l.metrica("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
        int i = c4974l.loadAd;
        if (i == 0) {
            AbstractC13082l.purchase("FloatList is empty.");
            throw null;
        }
        float[] fArr = c4974l.yandex;
        int i2 = 0;
        float fLoadAd = 0.0f;
        if (fArr[0] != 0.0f) {
            C8339l.metrica("First outline progress value is expected to be zero");
            throw null;
        }
        if (i == 0) {
            AbstractC13082l.purchase("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            C8339l.metrica("Last outline progress value is expected to be one");
            throw null;
        }
        this.f16466l = c16936l;
        this.f16464l = c10227l;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (c4974l.loadAd(i3) - c4974l.loadAd(i2) > 1.0E-4f) {
                arrayList2.add(new C15565l(this, (C17841l) arrayList.get(i2), fLoadAd, c4974l.loadAd(i3)));
                fLoadAd = c4974l.loadAd(i3);
            }
            i2 = i3;
        }
        C15565l c15565l = (C15565l) arrayList2.get(AbstractC14055l.smaato(arrayList2));
        float f = c15565l.crashlytics;
        if (1.0f < f) {
            C8339l.metrica("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        c15565l.crashlytics = f;
        c15565l.amazon = 1.0f;
        this.f16465l = arrayList2;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C15565l) {
            return super.contains((C15565l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (C15565l) this.f16465l.get(i);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C15565l) {
            return super.indexOf((C15565l) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C15565l) {
            return super.lastIndexOf((C15565l) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f16465l.size();
    }
}
