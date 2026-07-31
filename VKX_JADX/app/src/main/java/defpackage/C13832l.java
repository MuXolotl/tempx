package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۨۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13832l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f26976l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26977l;

    public /* synthetic */ C13832l(int i, Function1 function1) {
        this.f26977l = i;
        this.f26976l = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f26977l) {
            case 0:
                C8739l c8739l = (C8739l) obj;
                synchronized (AbstractC9620l.crashlytics) {
                    j = AbstractC9620l.purchase;
                    AbstractC9620l.purchase = 1 + j;
                }
                return new C6583l(j, c8739l, this.f26976l);
            case 1:
                return this.f26976l.invoke((AbstractC18041l) obj).toString();
            default:
                return this.f26976l.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
