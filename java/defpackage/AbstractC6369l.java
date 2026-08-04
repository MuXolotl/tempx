package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lَؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6369l {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13342l = AtomicReferenceFieldUpdater.newUpdater(AbstractC6369l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13341l = AtomicReferenceFieldUpdater.newUpdater(AbstractC6369l.class, Object.class, "_prev$volatile");

    public AbstractC6369l(AbstractC16653l abstractC16653l) {
        this._prev$volatile = abstractC16653l;
    }

    public abstract boolean amazon();

    public final AbstractC6369l crashlytics() {
        Object obj = f13342l.get(this);
        if (obj == AbstractC18590l.yandex) {
            return null;
        }
        return (AbstractC6369l) obj;
    }

    public final void loadAd() {
        f13341l.set(this, null);
    }

    public final void purchase() {
        AbstractC6369l abstractC6369lCrashlytics;
        if (crashlytics() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13341l;
            AbstractC6369l abstractC6369l = (AbstractC6369l) atomicReferenceFieldUpdater.get(this);
            while (abstractC6369l != null && abstractC6369l.amazon()) {
                abstractC6369l = (AbstractC6369l) atomicReferenceFieldUpdater.get(abstractC6369l);
            }
            AbstractC6369l abstractC6369lCrashlytics2 = crashlytics();
            while (abstractC6369lCrashlytics2.amazon() && (abstractC6369lCrashlytics = abstractC6369lCrashlytics2.crashlytics()) != null) {
                abstractC6369lCrashlytics2 = abstractC6369lCrashlytics;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC6369lCrashlytics2);
                AbstractC6369l abstractC6369l2 = ((AbstractC6369l) obj) == null ? null : abstractC6369l;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC6369lCrashlytics2, obj, abstractC6369l2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(abstractC6369lCrashlytics2) != obj) {
                    }
                }
            }
            if (abstractC6369l != null) {
                f13342l.set(abstractC6369l, abstractC6369lCrashlytics2);
            }
            if (!abstractC6369lCrashlytics2.amazon() || abstractC6369lCrashlytics2.crashlytics() == null) {
                if (abstractC6369l == null || !abstractC6369l.amazon()) {
                    return;
                }
            }
        }
    }
}
