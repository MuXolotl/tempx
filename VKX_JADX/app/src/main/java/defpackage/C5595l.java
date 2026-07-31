package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: renamed from: lؘُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5595l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C18474l f11886l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Set f11887l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1565l f11888l;

    public C5595l(C1565l c1565l) {
        C10227l c10227l = c1565l.purchase;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c10227l, 10));
        ListIterator listIterator = c10227l.listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                break;
            } else {
                arrayList.add(new C16755l(((C0078l) c13376l.next()).f987l));
            }
        }
        Set setM4229l = AbstractC16901l.m4229l(arrayList);
        this.f11888l = c1565l;
        this.f11887l = setM4229l;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c10227l, 10));
        ListIterator listIterator2 = c10227l.listIterator(0);
        while (true) {
            C13376l c13376l2 = (C13376l) listIterator2;
            if (!c13376l2.hasNext()) {
                AbstractC16901l.m4229l(arrayList2);
                this.f11886l = AbstractC1805l.yandex(false);
                return;
            }
            arrayList2.add(new C13172l(((C0078l) c13376l2.next()).f986l));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yandex();
    }

    public final void finalize() {
        if (yandex()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.f11888l.toString();
    }

    public final boolean yandex() {
        if (!this.f11886l.yandex()) {
            return false;
        }
        C1565l c1565l = this.f11888l;
        C11146l c11146l = c1565l.amazon;
        C10227l c10227l = c1565l.purchase;
        c11146l.m4256l();
        int iPro = c10227l.pro();
        for (int i = 0; i < iPro; i++) {
            C0078l c0078l = (C0078l) c10227l.get(i);
            if (this.f11887l.contains(new C16755l(c0078l.f987l))) {
                c0078l.m4256l();
            }
        }
        return true;
    }
}
