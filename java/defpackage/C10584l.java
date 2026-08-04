package defpackage;

import java.util.Collections;

/* JADX INFO: renamed from: lَؘۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10584l extends C9004l implements InterfaceC4815l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C6238l f21498l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public volatile C13645l f21499l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10584l(C16412l c16412l, C7646l c7646l, C6238l c6238l) {
        super(c16412l, c7646l);
        this.f21498l = c6238l;
        if (c16412l == null) {
            admob(0);
            throw null;
        }
        this.f21499l = null;
    }

    public static /* synthetic */ void admob(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public static /* synthetic */ void yandex(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.C9004l
    public final void billing(Object obj) {
        this.f21499l = new C13645l(obj);
        try {
            if (obj == null) {
                yandex(2);
                throw null;
            }
            this.f21498l.invoke(obj);
            this.f21499l = null;
        } catch (Throwable th) {
            this.f21499l = null;
            throw th;
        }
    }

    @Override // defpackage.C9004l, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objInvoke;
        C13645l c13645l = this.f21499l;
        if (c13645l == null || ((Thread) c13645l.f26670l) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) c13645l.f26670l) == Thread.currentThread()) {
            objInvoke = c13645l.f26671l;
        } else {
            C8339l.smaato("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        admob(2);
        throw null;
    }

    @Override // defpackage.C9004l
    public final C6921l mopub(boolean z) {
        return new C6921l((Object) new C5968l(Collections.singletonList(C8741l.amazon)), false, 6);
    }
}
