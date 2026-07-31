package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lۣؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0672l extends IOException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Exception f2143l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672l(String str, Exception exc) {
        super(str);
        this.f2143l = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f2143l;
    }
}
