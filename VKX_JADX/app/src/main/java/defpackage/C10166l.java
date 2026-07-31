package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lًَٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10166l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f20681l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f20682l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20683l = 0;

    public C10166l(Object obj, String str, ArrayDeque arrayDeque) {
        this.f20681l = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new C12122l(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int iMin = Math.min(arrayDeque.size(), 11);
                if (((String[]) this.f20682l) == null) {
                    this.f20682l = new String[12];
                }
                String strConcat = ((String[]) this.f20682l)[iMin];
                if (strConcat == null) {
                    char[] cArr = new char[iMin];
                    Arrays.fill(cArr, ' ');
                    String str2 = new String(cArr);
                    strConcat = iMin == 11 ? str2.concat("...") : str2;
                    ((String[]) this.f20682l)[iMin] = strConcat;
                }
                Log.v("CarApp.Bun", strConcat.concat(AbstractC3958l.subs(obj.getClass()) + " " + str));
            }
        }
    }

    public String billing() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = (ArrayDeque) this.f20681l;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((C12122l) itDescendingIterator.next()).yandex());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f20683l) {
            case 0:
                ((ArrayDeque) this.f20681l).removeFirst();
                break;
            default:
                AbstractC14910l abstractC14910l = (AbstractC14910l) this.f20682l;
                Object obj = this.f20681l;
                if (obj != null) {
                    abstractC14910l.loadAd(obj);
                    this.f20681l = null;
                    break;
                }
                break;
        }
    }

    public Object yandex() {
        Object obj = this.f20681l;
        if (obj != null) {
            return obj;
        }
        C8339l.smaato("Already closed");
        return null;
    }

    public C10166l(AbstractC14910l abstractC14910l) {
        this.f20682l = abstractC14910l;
        this.f20681l = abstractC14910l.yandex();
    }
}
