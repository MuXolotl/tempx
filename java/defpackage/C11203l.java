package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11203l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f22556l;

    public C11203l(boolean z) {
        this.f22556l = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0861l c0861l = (C0861l) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22556l ? "(raw) " : "");
        sb.append(c0861l);
        return sb.toString();
    }
}
