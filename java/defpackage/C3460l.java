package defpackage;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3460l implements InterfaceC14833l {
    public long amazon;
    public int billing;
    public int crashlytics;
    public InterfaceC8979l loadAd;
    public long mopub;
    public InterfaceC11823l purchase;
    public InterfaceC2053l yandex;

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.crashlytics = j == 0 ? 0 : 4;
        InterfaceC11823l interfaceC11823l = this.purchase;
        if (interfaceC11823l != null) {
            interfaceC11823l.yandex(j2);
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.yandex = interfaceC2053l;
        this.loadAd = interfaceC2053l.startapp(0, 1);
        interfaceC2053l.firebase();
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        return AbstractC17716l.yandex(interfaceC10430l);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        byte[] bArr;
        int i;
        this.loadAd.getClass();
        String str = AbstractC15323l.yandex;
        int i2 = this.crashlytics;
        int iM3985throws = 4;
        if (i2 == 0) {
            AbstractC12442l.subscription(interfaceC10430l.getPosition() == 0);
            int i3 = this.billing;
            if (i3 != -1) {
                interfaceC10430l.remoteconfig(i3);
                this.crashlytics = 4;
                return 0;
            }
            if (!AbstractC17716l.yandex(interfaceC10430l)) {
                throw C17655l.yandex(null, "Unsupported or unrecognized wav file type.");
            }
            interfaceC10430l.remoteconfig((int) (interfaceC10430l.mopub() - interfaceC10430l.getPosition()));
            this.crashlytics = 1;
            return 0;
        }
        long jStartapp = -1;
        if (i2 == 1) {
            C13143l c13143l = new C13143l(8);
            C8128l c8128lLoadAd = C8128l.loadAd(interfaceC10430l, c13143l);
            if (c8128lLoadAd.f16932l != 1685272116) {
                interfaceC10430l.smaato();
            } else {
                interfaceC10430l.admob(8);
                c13143l.m3562for(0);
                interfaceC10430l.yandex(0, 8, c13143l.yandex);
                jStartapp = c13143l.startapp();
                interfaceC10430l.remoteconfig(((int) c8128lLoadAd.f16931l) + 8);
            }
            this.amazon = jStartapp;
            this.crashlytics = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    C18073l.admob();
                    return 0;
                }
                AbstractC12442l.subscription(this.mopub != -1);
                long position = this.mopub - interfaceC10430l.getPosition();
                InterfaceC11823l interfaceC11823l = this.purchase;
                interfaceC11823l.getClass();
                return interfaceC11823l.loadAd(interfaceC10430l, position) ? -1 : 0;
            }
            interfaceC10430l.smaato();
            C8128l c8128lPurchase = AbstractC17716l.purchase(1684108385, interfaceC10430l, new C13143l(8));
            interfaceC10430l.remoteconfig(8);
            Pair pairCreate = Pair.create(Long.valueOf(interfaceC10430l.getPosition()), Long.valueOf(c8128lPurchase.f16931l));
            this.billing = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.amazon;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.mopub = ((long) this.billing) + jLongValue;
            long length = interfaceC10430l.getLength();
            if (length != -1 && this.mopub > length) {
                AbstractC6427l.vip("WavExtractor", "Data exceeds input length: " + this.mopub + ", " + length);
                this.mopub = length;
            }
            InterfaceC11823l interfaceC11823l2 = this.purchase;
            interfaceC11823l2.getClass();
            interfaceC11823l2.crashlytics(this.billing, this.mopub);
            this.crashlytics = 4;
            return 0;
        }
        C13143l c13143l2 = new C13143l(16);
        long j2 = AbstractC17716l.purchase(1718449184, interfaceC10430l, c13143l2).f16931l;
        AbstractC12442l.subscription(j2 >= 16);
        interfaceC10430l.yandex(0, 16, c13143l2.yandex);
        c13143l2.m3562for(0);
        int iTapsense = c13143l2.tapsense();
        int iTapsense2 = c13143l2.tapsense();
        int iSubscription = c13143l2.subscription();
        c13143l2.subscription();
        int iTapsense3 = c13143l2.tapsense();
        int iTapsense4 = c13143l2.tapsense();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            interfaceC10430l.yandex(0, i4, bArr);
            if (iTapsense == 65534 && i4 == 24) {
                C13143l c13143l3 = new C13143l(bArr);
                c13143l3.tapsense();
                int iTapsense5 = c13143l3.tapsense();
                if (iTapsense5 != 0 && iTapsense5 != iTapsense4) {
                    throw C17655l.crashlytics("validBits ( " + iTapsense5 + ")  != bitsPerSample( " + iTapsense4 + ") are not supported");
                }
                int iSubscription2 = c13143l3.subscription();
                if ((iSubscription2 >> 18) != 0) {
                    throw C17655l.crashlytics("invalid channel mask " + iSubscription2);
                }
                if (iSubscription2 != 0 && Integer.bitCount(iSubscription2) != iTapsense2) {
                    throw C17655l.crashlytics("invalid number of channels (" + Integer.bitCount(iSubscription2) + ") in channel mask " + iSubscription2);
                }
                iTapsense = c13143l3.tapsense();
                byte[] bArr2 = new byte[14];
                c13143l3.firebase(0, 14, bArr2);
                if (!Arrays.equals(bArr2, AbstractC17716l.yandex) && !Arrays.equals(bArr2, AbstractC17716l.loadAd)) {
                    throw C17655l.crashlytics("invalid wav format extension guid");
                }
            }
        } else {
            bArr = AbstractC15323l.loadAd;
        }
        interfaceC10430l.remoteconfig((int) (interfaceC10430l.mopub() - interfaceC10430l.getPosition()));
        C7200l c7200l = new C7200l();
        c7200l.yandex = iTapsense2;
        c7200l.loadAd = iSubscription;
        c7200l.crashlytics = iTapsense3;
        c7200l.amazon = iTapsense4;
        c7200l.purchase = bArr;
        if (iTapsense == 17) {
            this.purchase = new C2852l(this.yandex, this.loadAd, c7200l);
        } else if (iTapsense == 6) {
            this.purchase = new C1665l(this.yandex, this.loadAd, c7200l, "audio/g711-alaw", -1);
        } else if (iTapsense == 7) {
            this.purchase = new C1665l(this.yandex, this.loadAd, c7200l, "audio/g711-mlaw", -1);
        } else {
            if (iTapsense == 1) {
                iM3985throws = AbstractC15323l.m3985throws(iTapsense4, ByteOrder.LITTLE_ENDIAN);
                i = iM3985throws;
            } else {
                if (iTapsense != 3) {
                    if (iTapsense == 65534) {
                        iM3985throws = AbstractC15323l.m3985throws(iTapsense4, ByteOrder.LITTLE_ENDIAN);
                        i = iM3985throws;
                    }
                } else if (iTapsense4 == 32) {
                    i = iM3985throws;
                }
                i = 0;
            }
            if (i == 0) {
                throw C17655l.crashlytics("Unsupported WAV format type: " + iTapsense);
            }
            this.purchase = new C1665l(this.yandex, this.loadAd, c7200l, "audio/raw", i);
        }
        this.crashlytics = 3;
        return 0;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
