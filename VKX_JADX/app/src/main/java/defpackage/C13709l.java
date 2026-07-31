package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْ۠ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13709l implements InterfaceC1220l, Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f26766l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Function0 f26767l;

    @Override // defpackage.InterfaceC1220l
    public final Object getValue() {
        if (this.f26766l == C7472l.f15448l) {
            this.f26766l = this.f26767l.invoke();
            this.f26767l = null;
        }
        return this.f26766l;
    }

    public final String toString() {
        return yandex() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.InterfaceC1220l
    public final boolean yandex() {
        return this.f26766l != C7472l.f15448l;
    }
}
