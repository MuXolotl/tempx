package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: else, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Celse extends IllegalStateException {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Serializable f819l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f820l;

    public Celse(C14249l c14249l) {
        this.f820l = 3;
        this.f819l = "Response already received: " + c14249l;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f820l) {
            case 0:
                return (Exception) this.f819l;
            case 1:
                return (Exception) this.f819l;
            case 2:
                return (Exception) this.f819l;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f820l) {
            case 3:
                return (String) this.f819l;
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Celse(String str, Exception exc, int i) {
        super(str);
        this.f820l = i;
        this.f819l = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Celse(String str) {
        super(str);
        this.f820l = 0;
    }
}
