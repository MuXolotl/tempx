package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lۣٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2211l implements InterfaceC2636l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10964l f4886l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10964l f4887l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f4888l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ThreadLocal f4885l = new ThreadLocal();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AtomicBoolean f4889l = new AtomicBoolean(false);

    public C2211l(final C10023l c10023l, final String str, int i) {
        final int i2 = 0;
        C6760l c6760l = C9658l.f19699l;
        this.f4888l = AbstractC15918l.tapsense(30, EnumC16636l.SECONDS);
        if (i <= 0) {
            C8339l.metrica("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.f4887l = new C10964l(i, new Function0() { // from class: lُٗؒ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                C10023l c10023l2 = c10023l;
                switch (i3) {
                    case 0:
                        InterfaceC0684l interfaceC0684lFirebase = c10023l2.firebase(str2);
                        AbstractC13628l.amazon(interfaceC0684lFirebase, "PRAGMA query_only = 1");
                        return interfaceC0684lFirebase;
                    default:
                        return c10023l2.firebase(str2);
                }
            }
        });
        final int i3 = 1;
        this.f4886l = new C10964l(1, new Function0() { // from class: lُٗؒ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                String str2 = str;
                C10023l c10023l2 = c10023l;
                switch (i4) {
                    case 0:
                        InterfaceC0684l interfaceC0684lFirebase = c10023l2.firebase(str2);
                        AbstractC13628l.amazon(interfaceC0684lFirebase, "PRAGMA query_only = 1");
                        return interfaceC0684lFirebase;
                    default:
                        return c10023l2.firebase(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4889l.compareAndSet(false, true)) {
            this.f4887l.loadAd();
            this.f4886l.loadAd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #9 {all -> 0x019f, blocks: (B:88:0x0181, B:90:0x0187, B:92:0x0191, B:93:0x0196), top: B:137:0x0181 }] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0113, code lost:
    
        if (defpackage.AbstractC15342l.mopub(r8, r0, r4) == r14) goto L86;
     */
    @Override // defpackage.InterfaceC2636l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tapsense(boolean r17, kotlin.jvm.functions.Function2 r18, defpackage.AbstractC0283l r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2211l.tapsense(boolean, kotlin.jvm.functions.Function2, lّؑۧ):java.lang.Object");
    }

    public final void yandex(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.f4886l.crashlytics(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f4887l.crashlytics(sb);
        AbstractC13628l.smaato(5, sb.toString());
        throw null;
    }

    public C2211l(C10023l c10023l) {
        C6760l c6760l = C9658l.f19699l;
        this.f4888l = AbstractC15918l.tapsense(30, EnumC16636l.SECONDS);
        C10964l c10964l = new C10964l(1, new C13802l(18, c10023l));
        this.f4887l = c10964l;
        this.f4886l = c10964l;
    }
}
