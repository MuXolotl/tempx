package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٖٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C16412l {
    public static final String amazon;
    public static final C6430l purchase;
    public final String crashlytics;
    public final C1461l loadAd;
    public final InterfaceC2082l yandex;

    static {
        String canonicalName = C16412l.class.getCanonicalName();
        int iM3314case = AbstractC12024l.m3314case(0, 6, canonicalName, ".");
        amazon = iM3314case == -1 ? "" : canonicalName.substring(0, iM3314case);
        purchase = new C6430l("NO_LOCKS", C13863l.f27114l);
    }

    public C16412l(String str) {
        this(str, new C14965l(new ReentrantLock()));
    }

    public static void purchase(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(amazon)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public C6921l amazon(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : AbstractC15560l.subscription(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        purchase(assertionError);
        throw assertionError;
    }

    public final C18028l crashlytics(Function1 function1) {
        return new C18028l(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    public final C0098l loadAd(Function1 function1) {
        return new C0098l(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC0653l.ads(sb, this.crashlytics, ")");
    }

    public final C2278l yandex(Function0 function0) {
        return new C2278l(this, function0);
    }

    public C16412l(String str, InterfaceC2082l interfaceC2082l) {
        C1461l c1461l = C1461l.f3648l;
        this.yandex = interfaceC2082l;
        this.loadAd = c1461l;
        this.crashlytics = str;
    }
}
