package defpackage;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔؒۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2343l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14529l f5096l = new C14529l(8);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile SoftReference f5097l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function0 f5098l;

    public C2343l(Object obj, Function0 function0) {
        if (function0 == null) {
            C8339l.metrica("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.f5097l = null;
        this.f5098l = function0;
        if (obj != null) {
            this.f5097l = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2 = f5096l;
        SoftReference softReference = this.f5097l;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f5098l.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f5097l = new SoftReference(obj2);
        return objInvoke;
    }
}
