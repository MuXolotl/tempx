package defpackage;

import android.media.AudioTrack;
import android.media.audiofx.DynamicsProcessing;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13110l implements InterfaceC11209l {
    public DynamicsProcessing yandex;

    public static float admob(C18364l c18364l) {
        return ((Number) AbstractC8576l.admob(Float.valueOf((AbstractC8576l.billing(c18364l.f35879l, new C8934l(0, 100, 1)) / 100.0f) * 8.0f), new C12015l(0.0f, 8.0f))).floatValue();
    }

    public static DynamicsProcessing.Limiter amazon(C3597l c3597l) {
        C1887l c1887lAmazon = c3597l.f7521l;
        if (c1887lAmazon == null) {
            C18454l c18454l = C18454l.f36052l;
            c1887lAmazon = C18454l.amazon();
        }
        AbstractC1172l.billing();
        return AbstractC1172l.loadAd(c1887lAmazon.f4316l, c1887lAmazon.f4315l, c1887lAmazon.f4318l, c1887lAmazon.f4313l, c1887lAmazon.f4314l, c1887lAmazon.f4317l);
    }

    public static DynamicsProcessing.Mbc billing(C3597l c3597l) {
        C18364l c18364lYandex = c3597l.f7520l;
        if (c18364lYandex == null) {
            C18454l c18454l = C18454l.f36052l;
            c18364lYandex = C18454l.yandex();
        }
        boolean z = c18364lYandex.f35878l;
        List list = c18364lYandex.f35876l;
        if (c18364lYandex.f35877l) {
            DynamicsProcessing.Mbc mbc = new DynamicsProcessing.Mbc(true, z, list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mbc.setBand(i, purchase((C7117l) list.get(i)));
            }
            return mbc;
        }
        DynamicsProcessing.Mbc mbc2 = new DynamicsProcessing.Mbc(true, z, 3);
        C18454l c18454l2 = C18454l.f36052l;
        mbc2.setBand(0, purchase(new C7117l(125.0f, 1.1f, 0.0f, admob(c18364lYandex))));
        mbc2.setBand(1, purchase(new C7117l(6000.0f, 1.1f, 0.0f, 0.0f)));
        mbc2.setBand(2, purchase(new C7117l(20000.0f, 1.1f, 0.0f, subs(c18364lYandex))));
        return mbc2;
    }

    public static DynamicsProcessing.Eq crashlytics(C3597l c3597l) {
        C3554l c3554lLoadAd = c3597l.f7528l;
        if (c3554lLoadAd == null) {
            C18454l c18454l = C18454l.f36052l;
            c3554lLoadAd = C18454l.loadAd();
        }
        List list = c3554lLoadAd.f7469l;
        DynamicsProcessing.Eq eq = new DynamicsProcessing.Eq(true, true, list.size());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C2882l c2882l = (C2882l) obj;
            eq.setBand(i, new DynamicsProcessing.EqBand(true, c2882l.f6280l, c2882l.f6279l));
            i = i2;
        }
        return eq;
    }

    public static int isPro(C3597l c3597l) {
        C3554l c3554lLoadAd = c3597l.f7528l;
        if (c3554lLoadAd == null) {
            C18454l c18454l = C18454l.f36052l;
            c3554lLoadAd = C18454l.loadAd();
        }
        return c3554lLoadAd.f7469l.size();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    public static float mopub(C3597l c3597l, boolean z) {
        float fMax;
        float fFloatValue;
        List list;
        Float fValueOf;
        C18364l c18364l = c3597l.f7520l;
        Float fValueOf2 = null;
        if (c18364l == null || !c18364l.f35878l) {
            fMax = 0.0f;
        } else if (c18364l.f35877l) {
            Iterator it = c18364l.f35876l.iterator();
            if (it.hasNext()) {
                float fMax2 = ((C7117l) it.next()).f14910l;
                while (it.hasNext()) {
                    fMax2 = Math.max(fMax2, ((C7117l) it.next()).f14910l);
                }
                fValueOf = Float.valueOf(fMax2);
            } else {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fMax = fValueOf.floatValue();
            } else {
                fMax = 0.0f;
            }
        } else {
            fMax = Math.max(admob(c18364l), subs(c18364l));
        }
        C1887l c1887l = c3597l.f7521l;
        float f = (c1887l == null || !c1887l.f4316l) ? 0.0f : c1887l.f4317l;
        C3554l c3554l = c3597l.f7528l;
        if (c3554l == null || (list = c3554l.f7469l) == null) {
            fFloatValue = 0.0f;
        } else {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                float fMax3 = ((C2882l) it2.next()).f6279l;
                while (it2.hasNext()) {
                    fMax3 = Math.max(fMax3, ((C2882l) it2.next()).f6279l);
                }
                fValueOf2 = Float.valueOf(fMax3);
            }
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
        }
        float fMax4 = Math.max(fMax, Math.max(f, fFloatValue));
        float f2 = fMax4 >= 0.0f ? fMax4 : 0.0f;
        if (z) {
            f2 *= 0.5f;
        }
        return -f2;
    }

    public static DynamicsProcessing.MbcBand purchase(C7117l c7117l) {
        AbstractC1172l.amazon();
        return AbstractC1172l.crashlytics(c7117l.f14907l, c7117l.f14906l, c7117l.f14909l, c7117l.f14903l, c7117l.f14904l, c7117l.f14908l, c7117l.f14905l, c7117l.f14910l);
    }

    public static float subs(C18364l c18364l) {
        return ((Number) AbstractC8576l.admob(Float.valueOf((AbstractC8576l.billing(c18364l.f35875l, new C8934l(0, 100, 1)) / 100.0f) * 8.0f), new C12015l(0.0f, 8.0f))).floatValue();
    }

    @Override // defpackage.InterfaceC11209l
    public final boolean loadAd(C3597l c3597l) {
        Object c18435l;
        DynamicsProcessing dynamicsProcessing = this.yandex;
        if (dynamicsProcessing != null) {
            try {
                int bandCount = dynamicsProcessing.getMbcByChannelIndex(0).getBandCount();
                C18364l c18364lYandex = c3597l.f7520l;
                if (c18364lYandex == null) {
                    c18364lYandex = C18454l.yandex();
                }
                c18435l = Boolean.valueOf((bandCount == (c18364lYandex.f35877l ? c18364lYandex.f35876l.size() : 3) && dynamicsProcessing.getPreEqByChannelIndex(0).getBandCount() == isPro(c3597l) && dynamicsProcessing.getPostEqByChannelIndex(0).getBandCount() == isPro(c3597l)) ? false : true);
            } catch (Throwable th) {
                c18435l = new C18435l(th);
            }
            Object obj = Boolean.TRUE;
            if (c18435l instanceof C18435l) {
                c18435l = obj;
            }
            if (((Boolean) c18435l).booleanValue()) {
                return true;
            }
            DynamicsProcessing.Eq eqCrashlytics = crashlytics(c3597l);
            dynamicsProcessing.setPreEqAllChannelsTo(eqCrashlytics);
            dynamicsProcessing.setPostEqAllChannelsTo(eqCrashlytics);
            dynamicsProcessing.setMbcAllChannelsTo(billing(c3597l));
            dynamicsProcessing.setLimiterAllChannelsTo(amazon(c3597l));
            C7315l c7315l = c3597l.f7530l;
            if (c7315l != null) {
                if (!c7315l.f15171l) {
                    dynamicsProcessing.setInputGainAllChannelsTo(0.0f);
                } else if (c7315l.f15170l) {
                    dynamicsProcessing.setInputGainAllChannelsTo(mopub(c3597l, c7315l.f15172l));
                } else {
                    dynamicsProcessing.setInputGainbyChannel(0, c7315l.f15168l);
                    dynamicsProcessing.setInputGainbyChannel(1, c7315l.f15169l);
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC11209l
    public final void release() {
        DynamicsProcessing dynamicsProcessing = this.yandex;
        if (dynamicsProcessing != null) {
            dynamicsProcessing.release();
        }
        this.yandex = null;
    }

    @Override // defpackage.InterfaceC11209l
    public final void yandex(int i, C3597l c3597l) {
        int iIsPro = isPro(c3597l);
        C18364l c18364lYandex = c3597l.f7520l;
        if (c18364lYandex == null) {
            c18364lYandex = C18454l.yandex();
        }
        DynamicsProcessing.Config.Builder preferredFrameDuration = new DynamicsProcessing.Config.Builder(0, 2, true, iIsPro, true, c18364lYandex.f35877l ? c18364lYandex.f35876l.size() : 3, true, isPro(c3597l), true).setPreferredFrameDuration(4096000.0f / AudioTrack.getNativeOutputSampleRate(3));
        DynamicsProcessing.Eq eqCrashlytics = crashlytics(c3597l);
        preferredFrameDuration.setPreEqAllChannelsTo(eqCrashlytics);
        preferredFrameDuration.setPostEqAllChannelsTo(eqCrashlytics);
        preferredFrameDuration.setMbcAllChannelsTo(billing(c3597l));
        preferredFrameDuration.setLimiterAllChannelsTo(amazon(c3597l));
        C7315l c7315l = c3597l.f7530l;
        if (c7315l != null) {
            if (!c7315l.f15171l) {
                preferredFrameDuration.setInputGainAllChannelsTo(0.0f);
            } else if (c7315l.f15170l) {
                preferredFrameDuration.setInputGainAllChannelsTo(mopub(c3597l, c7315l.f15172l));
            } else {
                preferredFrameDuration.setInputGainByChannelIndex(0, c7315l.f15168l);
                preferredFrameDuration.setInputGainByChannelIndex(1, c7315l.f15169l);
            }
        }
        DynamicsProcessing dynamicsProcessing = new DynamicsProcessing(100, i, preferredFrameDuration.build());
        dynamicsProcessing.setEnabled(true);
        this.yandex = dynamicsProcessing;
    }
}
