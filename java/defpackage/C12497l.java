package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12497l implements InterfaceC1220l, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f24634l = AtomicReferenceFieldUpdater.newUpdater(C12497l.class, Object.class, "lؗۤؑ");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f24635l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile Function0 f24636l;

    @Override // defpackage.InterfaceC1220l
    public final Object getValue() {
        Object obj = this.f24635l;
        C7472l c7472l = C7472l.f15448l;
        if (obj != c7472l) {
            return obj;
        }
        Function0 function0 = this.f24636l;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24634l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7472l, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c7472l) {
                }
            }
            this.f24636l = null;
            return objInvoke;
        }
        return this.f24635l;
    }

    public final String toString() {
        return yandex() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.InterfaceC1220l
    public final boolean yandex() {
        return this.f24635l != C7472l.f15448l;
    }
}
