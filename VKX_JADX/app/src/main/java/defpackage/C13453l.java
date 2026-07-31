package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lْ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13453l implements InterfaceC11309l, InterfaceC15871l, InterfaceC3012l {
    public final C2689l amazon;
    public final C9950l crashlytics;
    public final boolean loadAd;
    public boolean purchase;
    public final Path yandex = new Path();
    public final C3316l billing = new C3316l(7);

    public C13453l(C9950l c9950l, AbstractC10437l abstractC10437l, C16348l c16348l) {
        this.loadAd = c16348l.amazon;
        this.crashlytics = c9950l;
        C2689l c2689l = new C2689l((List) c16348l.crashlytics.f833l);
        this.amazon = c2689l;
        abstractC10437l.amazon(c2689l);
        c2689l.yandex(this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f A[SYNTHETIC] */
    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.amazon.isPro = arrayList;
                return;
            }
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList2.get(i);
            if (interfaceC3012l instanceof C18251l) {
                C18251l c18251l = (C18251l) interfaceC3012l;
                if (c18251l.crashlytics == 1) {
                    ((ArrayList) this.billing.f7072l).add(c18251l);
                    c18251l.amazon(this);
                } else if (!(interfaceC3012l instanceof C18467l)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    C18467l c18467l = (C18467l) interfaceC3012l;
                    c18467l.loadAd.yandex(this);
                    arrayList.add(c18467l);
                }
            } else if (!(interfaceC3012l instanceof C18467l)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C18467l c18467l2 = (C18467l) interfaceC3012l;
                c18467l2.loadAd.yandex(this);
                arrayList.add(c18467l2);
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC11309l
    public final Path purchase() {
        boolean z = this.purchase;
        C2689l c2689l = this.amazon;
        Path path = this.yandex;
        if (z) {
            c2689l.getClass();
            return path;
        }
        path.reset();
        if (this.loadAd) {
            this.purchase = true;
            return path;
        }
        Path path2 = (Path) c2689l.amazon();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.billing.subs(path);
        this.purchase = true;
        return path;
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.purchase = false;
        this.crashlytics.invalidateSelf();
    }
}
