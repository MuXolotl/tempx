package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC14832l;
import defpackage.AbstractC8831l;
import defpackage.C0655l;
import defpackage.C12014l;
import defpackage.C17711l;
import defpackage.C17951l;
import defpackage.C18449l;
import defpackage.C2657l;
import defpackage.C4871l;
import defpackage.C5153l;
import defpackage.C6080l;
import defpackage.C6114l;
import defpackage.C6928l;
import defpackage.C8565l;
import defpackage.C8634l;
import defpackage.C9102l;
import defpackage.InterfaceC11795l;
import defpackage.InterfaceC15270l;
import defpackage.InterfaceC16922l;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends DSABase {

    public static class ecCVCDSA extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecCVCDSA() {
            super(new C0655l(), new C18449l(15), C8565l.f17664l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecCVCDSA224 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecCVCDSA224() {
            super(new C9102l(), new C18449l(15), C8565l.f17664l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecCVCDSA256 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecCVCDSA256() {
            super(new C2657l(), new C18449l(15), C8565l.f17664l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecCVCDSA384 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecCVCDSA384() {
            super(new C5153l(), new C18449l(15), C8565l.f17664l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecCVCDSA3_224 extends SignatureSpi {
        public ecCVCDSA3_224() {
            super(AbstractC14832l.yandex(), new C18449l(15), C8565l.f17664l);
        }
    }

    public static class ecCVCDSA3_256 extends SignatureSpi {
        public ecCVCDSA3_256() {
            super(AbstractC14832l.loadAd(), new C18449l(15), C8565l.f17664l);
        }
    }

    public static class ecCVCDSA3_384 extends SignatureSpi {
        public ecCVCDSA3_384() {
            super(AbstractC14832l.crashlytics(), new C18449l(15), C8565l.f17664l);
        }
    }

    public static class ecCVCDSA3_512 extends SignatureSpi {
        public ecCVCDSA3_512() {
            super(AbstractC14832l.amazon(), new C18449l(15), C8565l.f17664l);
        }
    }

    public static class ecCVCDSA512 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecCVCDSA512() {
            super(new C17711l(), new C18449l(15), C8565l.f17664l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDSA extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDSA() {
            super(new C0655l(), new C18449l(15), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDSA224 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDSA224() {
            super(new C9102l(), new C18449l(15), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDSA256 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDSA256() {
            super(new C2657l(), new C18449l(15), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDSA384 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDSA384() {
            super(new C5153l(), new C18449l(15), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDSA512 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDSA512() {
            super(new C17711l(), new C18449l(15), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new C4871l(), new C18449l(15), C6928l.f14515l);
        }
    }

    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(AbstractC14832l.yandex(), new C18449l(15), C6928l.f14515l);
        }
    }

    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(AbstractC14832l.loadAd(), new C18449l(15), C6928l.f14515l);
        }
    }

    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(AbstractC14832l.crashlytics(), new C18449l(15), C6928l.f14515l);
        }
    }

    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(AbstractC14832l.amazon(), new C18449l(15), C6928l.f14515l);
        }
    }

    public static class ecDSAShake128 extends SignatureSpi {
        public ecDSAShake128() {
            super(new C17951l(128), new C18449l(15, new C12014l(new C17951l(128))), C6928l.f14515l);
        }
    }

    public static class ecDSAShake256 extends SignatureSpi {
        public ecDSAShake256() {
            super(new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES), new C18449l(15, new C12014l(new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES))), C6928l.f14515l);
        }
    }

    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new C6080l(), new C18449l(15), C6928l.f14515l);
        }
    }

    public static class ecDetDSA extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDetDSA() {
            super(new C0655l(), new C18449l(15, new C12014l(new C0655l())), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDetDSA224 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDetDSA224() {
            super(new C9102l(), new C18449l(15, new C12014l(new C9102l())), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDetDSA256 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDetDSA256() {
            super(new C2657l(), new C18449l(15, new C12014l(new C2657l())), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDetDSA384 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDetDSA384() {
            super(new C5153l(), new C18449l(15, new C12014l(new C5153l())), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDetDSA512 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecDetDSA512() {
            super(new C17711l(), new C18449l(15, new C12014l(new C17711l())), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(AbstractC14832l.yandex(), new C18449l(15, new C12014l(AbstractC14832l.yandex())), C6928l.f14515l);
        }
    }

    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(AbstractC14832l.loadAd(), new C18449l(15, new C12014l(AbstractC14832l.loadAd())), C6928l.f14515l);
        }
    }

    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(AbstractC14832l.crashlytics(), new C18449l(15, new C12014l(AbstractC14832l.crashlytics())), C6928l.f14515l);
        }
    }

    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(AbstractC14832l.amazon(), new C18449l(15, new C12014l(AbstractC14832l.amazon())), C6928l.f14515l);
        }
    }

    public static class ecNR extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecNR() {
            super(new C0655l(), new C8634l(8, false), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecNR224 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecNR224() {
            super(new C9102l(), new C8634l(8, false), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecNR256 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecNR256() {
            super(new C2657l(), new C8634l(8, false), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecNR384 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecNR384() {
            super(new C5153l(), new C8634l(8, false), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecNR512 extends SignatureSpi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ecNR512() {
            super(new C17711l(), new C8634l(8, false), C6928l.f14515l);
            int i = AbstractC14832l.yandex;
        }
    }

    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new C4871l(), new C18449l(15), C8565l.f17664l);
        }
    }

    public SignatureSpi(InterfaceC16922l interfaceC16922l, InterfaceC11795l interfaceC11795l, InterfaceC15270l interfaceC15270l) {
        super(interfaceC16922l, interfaceC11795l, interfaceC15270l);
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        AbstractC8831l abstractC8831lGeneratePrivateKeyParameter = ECUtils.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        InterfaceC11795l interfaceC11795l = this.signer;
        if (secureRandom != null) {
            interfaceC11795l.init(true, new C6114l(abstractC8831lGeneratePrivateKeyParameter, secureRandom));
        } else {
            interfaceC11795l.init(true, abstractC8831lGeneratePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        AbstractC8831l abstractC8831lGeneratePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, abstractC8831lGeneratePublicKeyParameter);
    }
}
