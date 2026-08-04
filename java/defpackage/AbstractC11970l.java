package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import j$.util.Comparator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: lِۣٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11970l {
    public static final C13708l yandex = AbstractC1186l.isVip(12);

    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e A[RETURN] */
    public static AbstractC1186l loadAd(AudioDeviceInfo audioDeviceInfo) {
        int type;
        AbstractC1186l abstractC1186lYandex;
        AbstractC1186l abstractC1186lSignature;
        int speakerLayoutChannelMask;
        boolean zLoadAd = AbstractC6873l.loadAd(audioDeviceInfo.getType());
        C13708l c13708l = yandex;
        if (!zLoadAd) {
            if (audioDeviceInfo.getType() == 1) {
                return AbstractC1186l.isVip(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return AbstractC1186l.isVip(Integer.valueOf(speakerLayoutChannelMask));
                }
                AbstractC6427l.vip("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return c13708l;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                AbstractC1186l abstractC1186lYandex2 = yandex(audioDeviceInfo);
                if (!abstractC1186lYandex2.isEmpty()) {
                    return abstractC1186lYandex2;
                }
                AbstractC1186l abstractC1186lRemoteconfig = AbstractC12148l.remoteconfig(audioDeviceInfo.getAudioDescriptors());
                if (!abstractC1186lRemoteconfig.isEmpty()) {
                    return abstractC1186lRemoteconfig;
                }
            } else if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    AbstractC1186l abstractC1186lYandex3 = yandex(audioDeviceInfo);
                    if (!abstractC1186lYandex3.isEmpty()) {
                        return abstractC1186lYandex3;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            C9258l c9258l = AbstractC1186l.f3181l;
                            abstractC1186lSignature = C13708l.f26763l;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorAmazon = C8339l.amazon(it.next());
                                if (audioDescriptorAmazon.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorAmazon.getDescriptor();
                                    if (descriptor.length != 3) {
                                        AbstractC6427l.vip("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                    } else {
                                        int i2 = 0;
                                        if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                            byte b = descriptor[0];
                                            i2 = (b & 1) != 0 ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                i2 |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                i2 |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                i2 |= 192;
                                            }
                                            if ((b & 16) != 0) {
                                                i2 |= 1024;
                                            }
                                            if ((b & 32) != 0) {
                                                i2 |= 768;
                                            }
                                            if ((b & 128) != 0) {
                                                i2 |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                i2 |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                i2 |= 8192;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i2 |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 16) != 0) {
                                                i2 |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i2 |= 262144;
                                            }
                                            if ((b2 & 64) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i2 |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                i2 |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i2 = 8388608 | i2;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i2 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                            j$.util.List.EL.sort(arrayList, new C2351l(1));
                            abstractC1186lSignature = AbstractC1186l.Signature(arrayList);
                        }
                        if (!abstractC1186lSignature.isEmpty()) {
                            return abstractC1186lSignature;
                        }
                    }
                    AbstractC1186l abstractC1186lRemoteconfig2 = AbstractC12148l.remoteconfig(audioDescriptors);
                    if (!abstractC1186lRemoteconfig2.isEmpty()) {
                        return abstractC1186lRemoteconfig2;
                    }
                } else if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    abstractC1186lYandex = yandex(audioDeviceInfo);
                    if (!abstractC1186lYandex.isEmpty()) {
                        return abstractC1186lYandex;
                    }
                }
            } else if (i >= 31) {
                abstractC1186lYandex = yandex(audioDeviceInfo);
                if (!abstractC1186lYandex.isEmpty()) {
                    return abstractC1186lYandex;
                }
            }
        }
        return c13708l;
    }

    public static AbstractC1186l yandex(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new C12174l())));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && AbstractC15323l.m3968for(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return AbstractC1186l.Signature(treeSet);
    }
}
