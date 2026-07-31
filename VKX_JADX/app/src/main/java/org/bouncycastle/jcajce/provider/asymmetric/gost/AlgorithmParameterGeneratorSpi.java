package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.AbstractC12994l;
import defpackage.AbstractC8776l;
import defpackage.C0277l;
import defpackage.C0419l;
import defpackage.C18073l;
import defpackage.C18733l;
import defpackage.C6230l;
import defpackage.C8339l;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        AlgorithmParameters algorithmParameters;
        BigInteger[] bigIntegerArr;
        C0277l c0277l;
        int i;
        BigInteger[] bigIntegerArr2;
        BigInteger bigIntegerAdd;
        int i2;
        int i3;
        int i4;
        BigInteger bigIntegerAdd2;
        C18733l c18733l = new C18733l();
        SecureRandom secureRandomLoadAd = this.random;
        int i5 = this.strength;
        if (secureRandomLoadAd == null) {
            secureRandomLoadAd = AbstractC8776l.loadAd();
        }
        c18733l.yandex = i5;
        c18733l.loadAd = 2;
        c18733l.crashlytics = secureRandomLoadAd;
        BigInteger bigInteger = C18733l.purchase;
        BigInteger bigInteger2 = C18733l.amazon;
        BigInteger[] bigIntegerArr3 = new BigInteger[2];
        int i6 = c18733l.loadAd;
        SecureRandom secureRandom = c18733l.crashlytics;
        int i7 = 1023;
        if (i6 == 1) {
            int iNextInt = secureRandom.nextInt();
            int iNextInt2 = c18733l.crashlytics.nextInt();
            algorithmParameters = null;
            int i8 = c18733l.yandex;
            if (i8 == 512) {
                i2 = 0;
                c18733l.yandex(iNextInt, iNextInt2, bigIntegerArr3, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            } else {
                if (i8 != 1024) {
                    C8339l.metrica("Ooops! key size 512 or 1024 bit.");
                    return null;
                }
                while (true) {
                    if (iNextInt >= 0 && iNextInt <= 65536) {
                        break;
                    }
                    iNextInt = c18733l.crashlytics.nextInt() / 32768;
                    i7 = 1023;
                }
                while (true) {
                    if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                        break;
                    }
                    iNextInt2 = (c18733l.crashlytics.nextInt() / 32768) + 1;
                    i7 = 1023;
                }
                BigInteger[] bigIntegerArr4 = new BigInteger[2];
                BigInteger bigInteger3 = new BigInteger(Integer.toString(iNextInt2));
                i2 = 0;
                BigInteger bigInteger4 = new BigInteger("19381");
                int iYandex = c18733l.yandex(iNextInt, iNextInt2, bigIntegerArr4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                BigInteger bigInteger5 = bigIntegerArr4[0];
                int iYandex2 = c18733l.yandex(iYandex, iNextInt2, bigIntegerArr4, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                BigInteger bigInteger6 = bigIntegerArr4[0];
                BigInteger[] bigIntegerArr5 = new BigInteger[65];
                bigIntegerArr5[0] = new BigInteger(Integer.toString(iYandex2));
                loop2: while (true) {
                    int i9 = 0;
                    while (true) {
                        i3 = 64;
                        if (i9 >= 64) {
                            break;
                        }
                        int i10 = i9 + 1;
                        bigIntegerArr5[i10] = bigIntegerArr5[i9].multiply(bigInteger4).add(bigInteger3).mod(bigInteger.pow(16));
                        i9 = i10;
                    }
                    BigInteger bigInteger7 = new BigInteger("0");
                    int i11 = 0;
                    while (true) {
                        i4 = i3;
                        if (i11 >= i3) {
                            break;
                        }
                        bigInteger7 = bigInteger7.add(bigIntegerArr5[i11].multiply(bigInteger.pow(i11 * 16)));
                        i11++;
                        i3 = i4;
                    }
                    bigIntegerArr5[0] = bigIntegerArr5[i4];
                    BigInteger bigIntegerAdd3 = bigInteger.pow(i7).divide(bigInteger5.multiply(bigInteger6)).add(bigInteger.pow(i7).multiply(bigInteger7).divide(bigInteger5.multiply(bigInteger6).multiply(bigInteger.pow(1024))));
                    if (bigIntegerAdd3.mod(bigInteger).compareTo(bigInteger2) == 0) {
                        bigIntegerAdd3 = bigIntegerAdd3.add(bigInteger2);
                    }
                    BigInteger bigInteger8 = bigIntegerAdd3;
                    int i12 = 0;
                    while (true) {
                        BigInteger[] bigIntegerArr6 = bigIntegerArr5;
                        BigInteger bigInteger9 = bigInteger3;
                        long j = i12;
                        int i13 = i12;
                        bigIntegerAdd2 = bigInteger5.multiply(bigInteger6).multiply(bigInteger8.add(BigInteger.valueOf(j))).add(bigInteger2);
                        if (bigIntegerAdd2.compareTo(bigInteger.pow(1024)) != 1) {
                            if (bigInteger.modPow(bigInteger5.multiply(bigInteger6).multiply(bigInteger8.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger2) == 0 && bigInteger.modPow(bigInteger5.multiply(bigInteger8.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger2) != 0) {
                                break loop2;
                            }
                            i12 = i13 + 2;
                            bigInteger3 = bigInteger9;
                            bigIntegerArr5 = bigIntegerArr6;
                        } else {
                            bigInteger3 = bigInteger9;
                            bigIntegerArr5 = bigIntegerArr6;
                            i7 = 1023;
                        }
                    }
                }
                bigIntegerArr3[0] = bigIntegerAdd2;
                bigIntegerArr3[1] = bigInteger5;
            }
            BigInteger bigInteger10 = bigIntegerArr3[i2];
            BigInteger bigInteger11 = bigIntegerArr3[1];
            c0277l = new C0277l(bigInteger10, bigInteger11, c18733l.crashlytics(bigInteger10, bigInteger11), i2);
        } else {
            char c = 1;
            algorithmParameters = null;
            long jNextLong = secureRandom.nextLong();
            long jNextLong2 = c18733l.crashlytics.nextLong();
            int i14 = c18733l.yandex;
            if (i14 == 512) {
                bigIntegerArr = bigIntegerArr3;
                c18733l.loadAd(jNextLong, jNextLong2, bigIntegerArr, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            } else {
                if (i14 != 1024) {
                    C8339l.smaato("Ooops! key size 512 or 1024 bit.");
                    return null;
                }
                while (true) {
                    if (jNextLong >= 0 && jNextLong <= 4294967296L) {
                        break;
                    }
                    BigInteger[] bigIntegerArr7 = bigIntegerArr3;
                    jNextLong = c18733l.crashlytics.nextInt() * 2;
                    bigIntegerArr3 = bigIntegerArr7;
                }
                while (true) {
                    if (jNextLong2 >= 0 && jNextLong2 <= 4294967296L && jNextLong2 / 2 != 0) {
                        break;
                    }
                    long j2 = jNextLong;
                    BigInteger[] bigIntegerArr8 = bigIntegerArr3;
                    c = 1;
                    jNextLong2 = (c18733l.crashlytics.nextInt() * 2) + 1;
                    bigIntegerArr3 = bigIntegerArr8;
                    jNextLong = j2;
                }
                BigInteger[] bigIntegerArr9 = new BigInteger[2];
                BigInteger bigInteger12 = new BigInteger(Long.toString(jNextLong2));
                BigInteger bigInteger13 = new BigInteger("97781173");
                long j3 = jNextLong2;
                long jLoadAd = c18733l.loadAd(jNextLong, j3, bigIntegerArr9, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                BigInteger bigInteger14 = bigIntegerArr9[0];
                long jLoadAd2 = c18733l.loadAd(jLoadAd, j3, bigIntegerArr9, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                BigInteger bigInteger15 = bigIntegerArr9[0];
                BigInteger[] bigIntegerArr10 = new BigInteger[33];
                bigIntegerArr10[0] = new BigInteger(Long.toString(jLoadAd2));
                loop8: while (true) {
                    int i15 = 0;
                    while (true) {
                        i = 32;
                        if (i15 >= 32) {
                            break;
                        }
                        int i16 = i15 + 1;
                        bigIntegerArr10[i16] = bigIntegerArr10[i15].multiply(bigInteger13).add(bigInteger12).mod(bigInteger.pow(32));
                        i15 = i16;
                    }
                    BigInteger bigInteger16 = new BigInteger("0");
                    int i17 = 0;
                    while (i17 < i) {
                        bigInteger16 = bigInteger16.add(bigIntegerArr10[i17].multiply(bigInteger.pow(i17 * 32)));
                        i17++;
                        i = i;
                    }
                    bigIntegerArr10[0] = bigIntegerArr10[i];
                    BigInteger bigIntegerAdd4 = bigInteger.pow(1023).divide(bigInteger14.multiply(bigInteger15)).add(bigInteger.pow(1023).multiply(bigInteger16).divide(bigInteger14.multiply(bigInteger15).multiply(bigInteger.pow(1024))));
                    if (bigIntegerAdd4.mod(bigInteger).compareTo(bigInteger2) == 0) {
                        bigIntegerAdd4 = bigIntegerAdd4.add(bigInteger2);
                    }
                    int i18 = 0;
                    while (true) {
                        bigIntegerArr2 = bigIntegerArr3;
                        long j4 = i18;
                        bigIntegerAdd = bigInteger14.multiply(bigInteger15).multiply(bigIntegerAdd4.add(BigInteger.valueOf(j4))).add(bigInteger2);
                        BigInteger[] bigIntegerArr11 = bigIntegerArr10;
                        if (bigIntegerAdd.compareTo(bigInteger.pow(1024)) != 1) {
                            if (bigInteger.modPow(bigInteger14.multiply(bigInteger15).multiply(bigIntegerAdd4.add(BigInteger.valueOf(j4))), bigIntegerAdd).compareTo(bigInteger2) == 0 && bigInteger.modPow(bigInteger14.multiply(bigIntegerAdd4.add(BigInteger.valueOf(j4))), bigIntegerAdd).compareTo(bigInteger2) != 0) {
                                break loop8;
                            }
                            i18 += 2;
                            bigIntegerArr10 = bigIntegerArr11;
                            bigIntegerArr3 = bigIntegerArr2;
                        } else {
                            bigIntegerArr10 = bigIntegerArr11;
                            bigIntegerArr3 = bigIntegerArr2;
                        }
                    }
                }
                bigIntegerArr2[0] = bigIntegerAdd;
                bigIntegerArr2[1] = bigInteger14;
                bigIntegerArr = bigIntegerArr2;
                c = 1;
            }
            BigInteger bigInteger17 = bigIntegerArr[0];
            BigInteger bigInteger18 = bigIntegerArr[c];
            c0277l = new C0277l(bigInteger17, bigInteger18, c18733l.crashlytics(bigInteger17, bigInteger18), 0);
        }
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GOST3410");
            algorithmParametersCreateParametersInstance.init(new C6230l(new C0419l(c0277l.f1277l, c0277l.f1276l, c0277l.f1275l)));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e) {
            C18073l.license(e.getMessage());
            return algorithmParameters;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
