package defpackage;

import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: renamed from: lؚۤۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7633l extends C7972l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static volatile BouncyCastleProvider f15726l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7633l() {
        Cloneable provider;
        synchronized (C7633l.class) {
            try {
                provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
                if (!(provider instanceof BouncyCastleProvider)) {
                    if (f15726l == null) {
                        f15726l = new BouncyCastleProvider();
                    }
                    provider = f15726l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super(21, (BouncyCastleProvider) provider);
    }
}
