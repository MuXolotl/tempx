package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: throws, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cthrows extends IOException {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Serializable f36594l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cthrows(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.f36595l = 1;
        this.f36594l = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f36595l) {
            case 0:
                return (RuntimeException) this.f36594l;
            case 1:
            default:
                return super.getCause();
            case 2:
                return (GeneralSecurityException) this.f36594l;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f36595l) {
            case 1:
                return (String) this.f36594l;
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cthrows(String str, Exception exc, int i) {
        super(str);
        this.f36595l = i;
        this.f36594l = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cthrows(String str) {
        super(str);
        this.f36595l = 0;
    }
}
