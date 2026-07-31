package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٌَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8688l implements InterfaceC1220l, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Function0 f17894l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f17893l = C7472l.f15448l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f17892l = this;

    public C8688l(Function0 function0) {
        this.f17894l = function0;
    }

    @Override // defpackage.InterfaceC1220l
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f17893l;
        C7472l c7472l = C7472l.f15448l;
        if (obj != c7472l) {
            return obj;
        }
        synchronized (this.f17892l) {
            objInvoke = this.f17893l;
            if (objInvoke == c7472l) {
                objInvoke = this.f17894l.invoke();
                this.f17893l = objInvoke;
                this.f17894l = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return yandex() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.InterfaceC1220l
    public final boolean yandex() {
        return this.f17893l != C7472l.f15448l;
    }
}
