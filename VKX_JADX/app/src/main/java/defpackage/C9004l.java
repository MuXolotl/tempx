package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٟۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C9004l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile Object f18562l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function0 f18563l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16412l f18564l;

    public C9004l(C16412l c16412l, Function0 function0) {
        if (c16412l == null) {
            yandex(0);
            throw null;
        }
        this.f18562l = EnumC12766l.f25152l;
        this.f18564l = c16412l;
        this.f18563l = function0;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        Object objInvoke;
        C6921l c6921lMopub;
        EnumC12766l enumC12766l = EnumC12766l.f25150l;
        EnumC12766l enumC12766l2 = EnumC12766l.f25151l;
        Object obj = this.f18562l;
        if (!(obj instanceof EnumC12766l)) {
            AbstractC12408l.yandex(obj);
            return obj;
        }
        this.f18564l.yandex.lock();
        try {
            Object obj2 = this.f18562l;
            if (!(obj2 instanceof EnumC12766l)) {
                AbstractC12408l.yandex(obj2);
                this.f18564l.yandex.unlock();
                return obj2;
            }
            if (obj2 == enumC12766l2) {
                this.f18562l = enumC12766l;
                C6921l c6921lMopub2 = mopub(true);
                if (!c6921lMopub2.f14494l) {
                    objInvoke = c6921lMopub2.f14493l;
                } else if (obj2 == enumC12766l) {
                    c6921lMopub = mopub(false);
                    if (c6921lMopub.f14494l) {
                        this.f18562l = enumC12766l2;
                        try {
                            objInvoke = this.f18563l.invoke();
                            billing(objInvoke);
                            this.f18562l = objInvoke;
                        } catch (Throwable th) {
                            if (AbstractC7985l.amazon(th)) {
                                this.f18562l = EnumC12766l.f25152l;
                                throw th;
                            }
                            if (this.f18562l == enumC12766l2) {
                                this.f18562l = new C2501l(th);
                            }
                            this.f18564l.loadAd.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = c6921lMopub.f14493l;
                    }
                } else {
                    this.f18562l = enumC12766l2;
                    objInvoke = this.f18563l.invoke();
                    billing(objInvoke);
                    this.f18562l = objInvoke;
                }
            } else if (obj2 == enumC12766l) {
                c6921lMopub = mopub(false);
                if (c6921lMopub.f14494l) {
                    objInvoke = c6921lMopub.f14493l;
                } else {
                    this.f18562l = enumC12766l2;
                    objInvoke = this.f18563l.invoke();
                    billing(objInvoke);
                    this.f18562l = objInvoke;
                }
            } else {
                this.f18562l = enumC12766l2;
                objInvoke = this.f18563l.invoke();
                billing(objInvoke);
                this.f18562l = objInvoke;
            }
            this.f18564l.yandex.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.f18564l.yandex.unlock();
            throw th2;
        }
    }

    public C6921l mopub(boolean z) {
        C6921l c6921lAmazon = this.f18564l.amazon(null, "in a lazy value");
        if (c6921lAmazon != null) {
            return c6921lAmazon;
        }
        yandex(2);
        throw null;
    }

    public void billing(Object obj) {
    }
}
