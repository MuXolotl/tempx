package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lُٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14523l implements InterfaceC11309l, InterfaceC13697l {
    public final C10448l purchase;
    public final Path yandex = new Path();
    public final Path loadAd = new Path();
    public final Path crashlytics = new Path();
    public final ArrayList amazon = new ArrayList();

    public C14523l(C10448l c10448l) {
        this.purchase = c10448l;
    }

    @Override // defpackage.InterfaceC13697l
    public final void amazon(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) listIterator.previous();
            if (interfaceC3012l instanceof InterfaceC11309l) {
                this.amazon.add((InterfaceC11309l) interfaceC3012l);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.amazon;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC11309l) arrayList.get(i)).loadAd(list, list2);
            i++;
        }
    }

    @Override // defpackage.InterfaceC11309l
    public final Path purchase() {
        Path path = this.crashlytics;
        path.reset();
        C10448l c10448l = this.purchase;
        if (!c10448l.loadAd) {
            int iInmobi = AbstractC5020l.inmobi(c10448l.yandex);
            if (iInmobi == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.amazon;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((InterfaceC11309l) arrayList.get(i)).purchase());
                    i++;
                }
            } else {
                if (iInmobi == 1) {
                    yandex(Path.Op.UNION);
                    return path;
                }
                if (iInmobi == 2) {
                    yandex(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iInmobi == 3) {
                    yandex(Path.Op.INTERSECT);
                    return path;
                }
                if (iInmobi == 4) {
                    yandex(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    public final void yandex(Path.Op op) {
        Path path = this.loadAd;
        path.reset();
        Path path2 = this.yandex;
        path2.reset();
        ArrayList arrayList = this.amazon;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC11309l interfaceC11309l = (InterfaceC11309l) arrayList.get(size);
            if (interfaceC11309l instanceof C16649l) {
                C16649l c16649l = (C16649l) interfaceC11309l;
                ArrayList arrayList2 = (ArrayList) c16649l.amazon();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathPurchase = ((InterfaceC11309l) arrayList2.get(size2)).purchase();
                    Matrix matrixAmazon = c16649l.amazon;
                    C10780l c10780l = c16649l.firebase;
                    if (c10780l != null) {
                        matrixAmazon = c10780l.amazon();
                    } else {
                        matrixAmazon.reset();
                    }
                    pathPurchase.transform(matrixAmazon);
                    path.addPath(pathPurchase);
                }
            } else {
                path.addPath(interfaceC11309l.purchase());
            }
        }
        int i = 0;
        InterfaceC11309l interfaceC11309l2 = (InterfaceC11309l) arrayList.get(0);
        if (interfaceC11309l2 instanceof C16649l) {
            C16649l c16649l2 = (C16649l) interfaceC11309l2;
            List listAmazon = c16649l2.amazon();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listAmazon;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathPurchase2 = ((InterfaceC11309l) arrayList3.get(i)).purchase();
                Matrix matrixAmazon2 = c16649l2.amazon;
                C10780l c10780l2 = c16649l2.firebase;
                if (c10780l2 != null) {
                    matrixAmazon2 = c10780l2.amazon();
                } else {
                    matrixAmazon2.reset();
                }
                pathPurchase2.transform(matrixAmazon2);
                path2.addPath(pathPurchase2);
                i++;
            }
        } else {
            path2.set(interfaceC11309l2.purchase());
        }
        this.crashlytics.op(path2, path, op);
    }
}
