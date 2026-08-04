package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lُۤۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11464l {
    public final /* synthetic */ C12952l amazon;
    public boolean crashlytics;
    public final ArrayList yandex = new ArrayList();
    public final ArrayDeque loadAd = new ArrayDeque();

    public C11464l(C12952l c12952l) {
        this.amazon = c12952l;
    }

    public final void loadAd(boolean z) {
        this.loadAd.removeLast();
        if (this.loadAd.isEmpty()) {
            this.amazon.crashlytics.remove();
            if (z) {
                synchronized (this.amazon.amazon) {
                    try {
                        int size = this.yandex.size();
                        for (int i = 0; i < size; i++) {
                            C15945l c15945l = (C15945l) this.yandex.get(i);
                            AbstractC7188l abstractC7188l = (AbstractC7188l) this.amazon.amazon.put(c15945l.crashlytics, c15945l.amazon);
                            if (abstractC7188l != null) {
                                c15945l.amazon = abstractC7188l;
                                this.amazon.amazon.put(c15945l.crashlytics, abstractC7188l);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final IllegalArgumentException yandex(IllegalArgumentException illegalArgumentException) {
        if (!this.crashlytics) {
            this.crashlytics = true;
            ArrayDeque arrayDeque = this.loadAd;
            if (arrayDeque.size() != 1 || ((C15945l) arrayDeque.getFirst()).loadAd != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    C15945l c15945l = (C15945l) itDescendingIterator.next();
                    sb.append("\nfor ");
                    Type type = c15945l.yandex;
                    String str = c15945l.loadAd;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }
}
