package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: lؙؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0149l extends AbstractC13244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayDeque f1055l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6761l f1056l;

    public C0149l(C6761l c6761l) {
        this.f1056l = c6761l;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1055l = arrayDeque;
        File file = (File) c6761l.amazon;
        if (file.isDirectory()) {
            arrayDeque.push(crashlytics(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C6485l(file));
        } else {
            this.f26017l = 2;
        }
    }

    public final AbstractC16335l crashlytics(File file) {
        int iInmobi = AbstractC5020l.inmobi(this.f1056l.loadAd);
        if (iInmobi == 0) {
            return new C1230l(this, file);
        }
        if (iInmobi == 1) {
            return new C3516l(this, file);
        }
        C18725l.billing();
        return null;
    }

    @Override // defpackage.AbstractC13244l
    public final void yandex() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f1055l;
            AbstractC17188l abstractC17188l = (AbstractC17188l) arrayDeque.peek();
            if (abstractC17188l == null) {
                file = null;
                break;
            }
            File fileYandex = abstractC17188l.yandex();
            if (fileYandex == null) {
                arrayDeque.pop();
            } else {
                if (fileYandex.equals(abstractC17188l.yandex) || !fileYandex.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileYandex;
                    break;
                }
                arrayDeque.push(crashlytics(fileYandex));
            }
        }
        if (file == null) {
            this.f26017l = 2;
        } else {
            this.f26016l = file;
            this.f26017l = 1;
        }
    }
}
