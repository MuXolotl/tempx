package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.car.app.navigation.model.Maneuver;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaAlbum;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;

/* JADX INFO: renamed from: lَۤۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10685l implements InterfaceC18001l, InterfaceC5479l, InterfaceC16711l, InterfaceC17224l, InterfaceC16334l, InterfaceC18517l, InterfaceC14606l, InterfaceC0612l, InterfaceC12679l, InterfaceC8038l, InterfaceC8170l, NotificationCallback, InterfaceC10153l, InterfaceC4041l, InterfaceC15930l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f21690l;

    public C10685l(int i) {
        boolean z = false;
        switch (i) {
            case 4:
                this.f21690l = new HashMap();
                break;
            case 6:
                this.f21690l = AbstractC11190l.yandex(C3489l.loadAd);
                break;
            case 7:
                if (Build.VERSION.SDK_INT < 35) {
                    this.f21690l = new C10111l(14, z);
                } else {
                    this.f21690l = new C14677l();
                }
                break;
            case 11:
                this.f21690l = new AtomicBoolean(false);
                break;
            case 13:
                this.f21690l = new LinkedHashMap();
                break;
            case 15:
                this.f21690l = AbstractC9549l.yandex(new C18334l(18));
                break;
            case 20:
                this.f21690l = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                this.f21690l = new ArrayList();
                break;
            default:
                this.f21690l = C5104l.crashlytics();
                break;
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static /* synthetic */ List m2943abstract(C10685l c10685l, CharSequence charSequence, int i, int i2, Function2 function2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return c10685l.m2954import(charSequence, i, i2, (i3 & 8) == 0, function2);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static String m2944catch(AbstractC18643l abstractC18643l) {
        return abstractC18643l.subscription() + '_' + abstractC18643l.startapp();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m2945extends(C10685l c10685l, C10685l c10685l2, C10685l c10685l3) {
        for (int i = 0; i < 64; i++) {
            short[] sArr = (short[]) c10685l.f21690l;
            int i2 = i * 4;
            short[] sArr2 = (short[]) c10685l2.f21690l;
            short s = sArr2[i2];
            int i3 = i2 + 1;
            short s2 = sArr2[i3];
            short[] sArr3 = (short[]) c10685l3.f21690l;
            short s3 = sArr3[i2];
            short s4 = sArr3[i3];
            int i4 = i + 64;
            short[] sArr4 = AbstractC13573l.yandex;
            AbstractC13573l.yandex(sArr, i2, s, s2, s3, s4, sArr4[i4]);
            short[] sArr5 = (short[]) c10685l.f21690l;
            int i5 = i2 + 2;
            short[] sArr6 = (short[]) c10685l2.f21690l;
            short s5 = sArr6[i5];
            int i6 = i2 + 3;
            short s6 = sArr6[i6];
            short[] sArr7 = (short[]) c10685l3.f21690l;
            AbstractC13573l.yandex(sArr5, i5, s5, s6, sArr7[i5], sArr7[i6], (short) (sArr4[i4] * (-1)));
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static C15607l m2946switch(InterfaceC11792l interfaceC11792l) {
        Object obj = null;
        if (interfaceC11792l == null) {
            return null;
        }
        return new C15607l(interfaceC11792l, new Size(interfaceC11792l.purchase(), interfaceC11792l.loadAd()), new C15483l(new C8043l(interfaceC11792l.mo1829const().crashlytics(), obj, C12920l.loadAd)));
    }

    @Override // defpackage.InterfaceC18001l
    public int ad() {
        return ((Image.Plane) this.f21690l).getPixelStride();
    }

    @Override // defpackage.InterfaceC5479l
    public C5104l adcel() {
        throw null;
    }

    @Override // defpackage.InterfaceC17224l
    public void admob() {
        ((InterfaceC17224l) this.f21690l).admob();
    }

    @Override // defpackage.InterfaceC8170l
    public void ads() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.InterfaceC0612l
    public void advert() {
        C11727l c11727l = (C11727l) this.f21690l;
        if (c11727l.f23468l != null) {
            c11727l.m3233l(0, 1);
        }
    }

    @Override // defpackage.InterfaceC14606l
    public /* bridge */ /* synthetic */ void amazon(Object obj) {
    }

    @Override // defpackage.InterfaceC0612l
    public void applovin() {
        C2865l c2865l = ((C11727l) this.f21690l).f13939l;
        if (c2865l != null) {
            c2865l.yandex();
        }
    }

    @Override // defpackage.InterfaceC16334l
    public Object appmetrica(String str) {
        return ((InterfaceC2165l) this.f21690l).loadAd(str, null);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public void m2947case() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.f21690l;
            short s = (short) (sArr[i] - 3329);
            sArr[i] = (short) (s + ((s >> 15) & 3329));
        }
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public AbstractC12669l m2948class() {
        return (AbstractC12669l) ((C1008l) this.f21690l).getValue();
    }

    @Override // defpackage.InterfaceC12679l
    public void close() {
        ((C8634l) this.f21690l).close();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public C13436l m2949continue(C7819l c7819l, C1791l c1791l, C9192l c9192l, int i) {
        boolean zSubscription;
        int iAbs;
        boolean z;
        boolean z2;
        int i2 = c7819l.firebase;
        int i3 = c7819l.tapsense;
        if (AbstractC14814l.billing(i2)) {
            C16554l c16554lAmazon = ((C13177l) this.f21690l).amazon();
            C13436l c13436lLoadAd = c16554lAmazon != null ? c16554lAmazon.loadAd(c1791l) : null;
            if (c13436lLoadAd != null) {
                InterfaceC1286l interfaceC1286l = c13436lLoadAd.yandex;
                C13028l c13028l = interfaceC1286l instanceof C13028l ? (C13028l) interfaceC1286l : null;
                if (c13028l == null) {
                    zSubscription = true;
                } else {
                    Bitmap.Config config = c13028l.yandex.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    zSubscription = C18595l.subscription(c7819l, config);
                }
                if (zSubscription) {
                    String str = (String) c1791l.loadAd.get("coil#size");
                    if (str == null) {
                        Object obj = c13436lLoadAd.loadAd.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || !(AbstractC8576l.yandex(c9192l, C9192l.crashlytics) || i3 == 2)) {
                            int iPurchase = interfaceC1286l.purchase();
                            int iLoadAd = interfaceC1286l.loadAd();
                            C9192l c9192l2 = interfaceC1286l instanceof C13028l ? (C9192l) AbstractC0532l.crashlytics(c7819l, AbstractC12872l.loadAd) : C9192l.crashlytics;
                            InterfaceC18382l interfaceC18382l = c9192l.yandex;
                            int i4 = interfaceC18382l instanceof C12881l ? ((C12881l) interfaceC18382l).yandex : Integer.MAX_VALUE;
                            InterfaceC18382l interfaceC18382l2 = c9192l2.yandex;
                            int iMin = Math.min(i4, interfaceC18382l2 instanceof C12881l ? ((C12881l) interfaceC18382l2).yandex : Integer.MAX_VALUE);
                            InterfaceC18382l interfaceC18382l3 = c9192l.loadAd;
                            int i5 = interfaceC18382l3 instanceof C12881l ? ((C12881l) interfaceC18382l3).yandex : Integer.MAX_VALUE;
                            InterfaceC18382l interfaceC18382l4 = c9192l2.loadAd;
                            int iMin2 = Math.min(i5, interfaceC18382l4 instanceof C12881l ? ((C12881l) interfaceC18382l4).yandex : Integer.MAX_VALUE);
                            double d = ((double) iMin) / ((double) iPurchase);
                            double d2 = ((double) iMin2) / ((double) iLoadAd);
                            int iInmobi = AbstractC5020l.inmobi((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? 2 : i);
                            if (iInmobi != 0) {
                                if (iInmobi != 1) {
                                    C18725l.billing();
                                    return null;
                                }
                                if (d < d2) {
                                    iAbs = Math.abs(iMin - iPurchase);
                                } else {
                                    iAbs = Math.abs(iMin2 - iLoadAd);
                                    d = d2;
                                }
                            } else if (d > d2) {
                                iAbs = Math.abs(iMin - iPurchase);
                            } else {
                                iAbs = Math.abs(iMin2 - iLoadAd);
                                d = d2;
                            }
                            z = true;
                            if (iAbs > 1) {
                                int iInmobi2 = AbstractC5020l.inmobi(i3);
                                if (iInmobi2 != 0) {
                                    if (iInmobi2 != 1) {
                                        C18725l.billing();
                                        return null;
                                    }
                                    if (d > 1.0d) {
                                        z2 = false;
                                    }
                                } else if (d != 1.0d) {
                                    z2 = false;
                                }
                            }
                        } else {
                            z = true;
                        }
                        z2 = z;
                    } else if (str.equals(c9192l.toString())) {
                        z = true;
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    return c13436lLoadAd;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC18001l
    public ByteBuffer crashlytics() {
        return ((Image.Plane) this.f21690l).getBuffer();
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m2950default(InterfaceC17944l interfaceC17944l) {
        for (C6916l c6916l : interfaceC17944l.startapp()) {
            ((C5104l) this.f21690l).purchase(c6916l, interfaceC17944l.mo860class(c6916l), interfaceC17944l.adcel(c6916l));
        }
    }

    @Override // defpackage.InterfaceC4041l
    /* JADX INFO: renamed from: else */
    public void mo1470else(long[] jArr) {
        long[][] jArr2 = (long[][]) this.f21690l;
        if (jArr2 == null) {
            this.f21690l = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 8);
        } else {
            long[] jArr3 = jArr2[1];
            if (((jArr[0] ^ jArr3[0]) | (jArr[1] ^ jArr3[1]) | (jArr[2] ^ jArr3[2]) | (jArr[3] ^ jArr3[3]) | (jArr[4] ^ jArr3[4]) | (jArr[5] ^ jArr3[5]) | (jArr[6] ^ jArr3[6]) | (jArr[7] ^ jArr3[7])) == 0) {
                return;
            }
        }
        AbstractC14055l.mopub(jArr, ((long[][]) this.f21690l)[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr4 = (long[][]) this.f21690l;
            long[] jArr5 = jArr4[i >> 1];
            long[] jArr6 = jArr4[i];
            long j = jArr5[0];
            long j2 = jArr5[1];
            long j3 = jArr5[2];
            long j4 = jArr5[3];
            long j5 = jArr5[4];
            long j6 = jArr5[5];
            long j7 = jArr5[6];
            long j8 = jArr5[7];
            jArr6[0] = (j << 1) ^ ((j8 >> 63) & 293);
            jArr6[1] = (j2 << 1) | (j >>> 63);
            jArr6[2] = (j3 << 1) | (j2 >>> 63);
            jArr6[3] = (j4 << 1) | (j3 >>> 63);
            jArr6[4] = (j5 << 1) | (j4 >>> 63);
            jArr6[5] = (j6 << 1) | (j5 >>> 63);
            jArr6[6] = (j7 << 1) | (j6 >>> 63);
            jArr6[7] = (j8 << 1) | (j7 >>> 63);
            AbstractC14055l.loadAd(jArr6, jArr4[1], jArr4[i + 1]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public C1791l m2951final(C7819l c7819l, Object obj, C15106l c15106l, C5346l c5346l) {
        String str;
        String strVip;
        int i = c7819l.firebase;
        Map map = c7819l.purchase;
        if (i != 4) {
            String str2 = c7819l.amazon;
            if (str2 != null) {
                return new C1791l(str2, map);
            }
            List list = ((C13177l) this.f21690l).amazon.crashlytics;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    C8195l c8195l = (C8195l) list.get(i2);
                    C7323l c7323l = (C7323l) c8195l.f17098l;
                    if (((InterfaceC1388l) c8195l.f17097l).mo886strictfp(obj)) {
                        switch (c7323l.yandex) {
                            case 0:
                                UmaTrack umaTrack = (UmaTrack) obj;
                                C9192l c9192l = c15106l.loadAd;
                                UmaAlbum umaAlbum = umaTrack.billing;
                                str = umaAlbum == null ? "uma_track_byTrack_" + umaTrack.yandex + '_' + AbstractC3124l.yandex(c9192l) : "uma_track_byAlbum_" + umaAlbum.loadAd + '_' + AbstractC3124l.yandex(c9192l);
                                break;
                            case 1:
                                AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
                                str = "vk_playlist_" + audioPlaylist.amazon + '_' + audioPlaylist.crashlytics + '_' + AbstractC3124l.yandex(c15106l.loadAd);
                                break;
                            case 2:
                                AudioAlbum audioAlbum = ((AudioTrack) obj).vip;
                                if (audioAlbum == null) {
                                    str = null;
                                } else {
                                    str = "vk_track_" + audioAlbum.loadAd() + '_' + AbstractC3124l.yandex(c15106l.loadAd);
                                }
                                break;
                            case 3:
                                C16060l c16060l = (C16060l) obj;
                                if (!AbstractC8576l.yandex(c16060l.crashlytics, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = c15106l.yandex.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = AbstractC4032l.yandex;
                                    str = c16060l + ":" + (configuration.uiMode & 48);
                                }
                                break;
                            case 4:
                                C16060l c16060l2 = (C16060l) obj;
                                String str3 = c16060l2.crashlytics;
                                if (!(str3 == null || str3.equals("file")) || c16060l2.purchase == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = AbstractC4032l.yandex;
                                    if ((AbstractC8576l.yandex(c16060l2.crashlytics, "file") && AbstractC8576l.yandex(AbstractC16901l.m4217extends(AbstractC1051l.metrica(c16060l2)), "android_asset")) || !((Boolean) AbstractC0532l.amazon(c15106l, AbstractC12872l.crashlytics)).booleanValue() || (strVip = AbstractC1051l.vip(c16060l2)) == null) {
                                        str = null;
                                    } else {
                                        AbstractC5921l abstractC5921l = c15106l.billing;
                                        String str4 = C14025l.f27330l;
                                        str = c16060l2 + "-" + abstractC5921l.m1876synchronized(C6162l.adcel(strVip, false)).billing;
                                    }
                                }
                                break;
                            default:
                                str = ((C16060l) obj).yandex;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i2++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) AbstractC0532l.crashlytics(c7819l, AbstractC12872l.yandex)).isEmpty()) {
                    return new C1791l(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", c15106l.loadAd.toString());
                return new C1791l(str, linkedHashMap);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC18001l
    public int firebase() {
        return ((Image.Plane) this.f21690l).getRowStride();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public C16443l m2952for() {
        return new C16443l(5, C7420l.yandex((C5104l) this.f21690l));
    }

    @Override // defpackage.InterfaceC12679l
    public Surface getSurface() {
        return ((C8634l) this.f21690l).getSurface();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public Object m2953goto(AbstractC18643l abstractC18643l, AbstractC0283l abstractC0283l) {
        C7079l c7079l;
        String strYandex;
        Object obj;
        if (abstractC0283l instanceof C7079l) {
            c7079l = (C7079l) abstractC0283l;
            int i = c7079l.f14828l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7079l.f14828l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7079l = new C7079l(this, abstractC0283l);
            }
        } else {
            c7079l = new C7079l(this, abstractC0283l);
        }
        Object objM3168l = c7079l.f14829l;
        int i2 = c7079l.f14828l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c7079l.f14830l = abstractC18643l;
            c7079l.f14828l = 1;
            objM3168l = C6336l.loadAd.m3168l(c7079l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC18643l = c7079l.f14830l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        XTrackLyrics xTrackLyrics = (XTrackLyrics) AbstractC11356l.loadAd(((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(XTrackLyrics.class), "id == $0", Arrays.copyOf(new Object[]{m2944catch(abstractC18643l)}, 1)));
        if (xTrackLyrics != null && (strYandex = xTrackLyrics.yandex()) != null) {
            try {
                C13047l c13047l = (C13047l) this.f21690l;
                c13047l.getClass();
                obj = (InterfaceC0582l) c13047l.loadAd(AbstractC7303l.crashlytics(InterfaceC0582l.Companion.serializer()), strYandex);
            } catch (C14747l unused) {
                obj = C6884l.INSTANCE;
            }
            if (obj != null) {
                return obj;
            }
        }
        return C6884l.INSTANCE;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public List m2954import(CharSequence charSequence, int i, int i2, boolean z, Function2 function2) {
        if (charSequence.length() == 0) {
            C8339l.metrica("Couldn't search in char tree for empty string");
            return null;
        }
        C7215l c7215l = (C7215l) this.f21690l;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (((Boolean) function2.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt))).booleanValue()) {
                break;
            }
            C7215l[] c7215lArr = c7215l.amazon;
            C7215l c7215l2 = c7215lArr[cCharAt];
            if (c7215l2 == null) {
                c7215l = z ? c7215lArr[Character.toLowerCase(cCharAt)] : null;
                if (c7215l == null) {
                    return C2580l.f5619l;
                }
            } else {
                c7215l = c7215l2;
            }
            i++;
        }
        return c7215l.loadAd;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public boolean m2955instanceof(C1791l c1791l, C7819l c7819l, C15168l c15168l) {
        C16554l c16554lAmazon;
        if (c1791l == null || !AbstractC14814l.mopub(c7819l.firebase) || !c15168l.yandex.admob() || (c16554lAmazon = ((C13177l) this.f21690l).amazon()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c15168l.loadAd));
        String str = c15168l.amazon;
        if (str != null) {
            linkedHashMap.put("coil#disk_cache_key", str);
        }
        InterfaceC1286l interfaceC1286l = c15168l.yandex;
        Map mapSubs = AbstractC18296l.subs(linkedHashMap);
        synchronized (c16554lAmazon.crashlytics) {
            long jMopub = interfaceC1286l.mopub();
            if (jMopub < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jMopub).toString());
            }
            c16554lAmazon.yandex.isPro(c1791l, interfaceC1286l, mapSubs, jMopub);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m2956interface(byte b, C17951l c17951l, byte[] bArr) {
        byte[] bArr2 = new byte[128];
        c17951l.billing(32, 32, bArr);
        c17951l.update(b);
        c17951l.crashlytics(0, 128, bArr2);
        for (int i = 0; i < 32; i++) {
            int iMetrica = AbstractC10000l.metrica(i * 4, bArr2);
            int i2 = (iMetrica & 1431655765) + ((iMetrica >>> 1) & 1431655765);
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 4;
                ((short[]) this.f21690l)[(i * 8) + i3] = (short) (((short) ((i2 >>> i4) & 3)) - ((short) ((i2 >>> (i4 + 2)) & 3)));
            }
        }
    }

    @Override // defpackage.InterfaceC18517l
    public void isPro(Object obj) {
        Map map = (Map) obj;
        C13734l c13734l = (C13734l) this.f21690l;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        C17624l c17624l = (C17624l) c13734l.f26814throws.pollFirst();
        if (c17624l == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = c17624l.f34294l;
            if (c13734l.crashlytics.m2861super(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // defpackage.InterfaceC4041l
    public void isVip(long[] jArr) {
        long[] jArr2 = new long[8];
        AbstractC14055l.mopub(((long[][]) this.f21690l)[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i = 62; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = jArr2[2];
            long j4 = jArr2[3];
            long j5 = jArr2[4];
            long j6 = jArr2[5];
            long j7 = jArr2[6];
            long j8 = jArr2[7];
            long j9 = j8 >>> 56;
            jArr2[0] = ((((j << 8) ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 8);
            jArr2[1] = (j2 << 8) | (j >>> 56);
            jArr2[2] = (j3 << 8) | (j2 >>> 56);
            jArr2[3] = (j4 << 8) | (j3 >>> 56);
            jArr2[4] = (j5 << 8) | (j4 >>> 56);
            jArr2[5] = (j6 << 8) | (j5 >>> 56);
            jArr2[6] = (j7 << 8) | (j6 >>> 56);
            jArr2[7] = (j8 << 8) | (j7 >>> 56);
            AbstractC14055l.loadAd(((long[][]) this.f21690l)[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        AbstractC14055l.mopub(jArr2, jArr);
    }

    @Override // defpackage.InterfaceC16711l
    public long license(long j, long j2, C16918l c16918l, EnumC9931l enumC9931l) {
        long j3 = ((C5177l) ((Function0) this.f21690l).invoke()).yandex;
        return (((long) AbstractC2219l.crashlytics(c16918l.loadAd + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) AbstractC2219l.crashlytics(c16918l.yandex + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), enumC9931l == EnumC9931l.f20223l)) << 32);
    }

    @Override // defpackage.InterfaceC12679l
    public int loadAd() {
        return ((C8634l) this.f21690l).loadAd();
    }

    @Override // defpackage.InterfaceC12679l
    public int metrica() {
        return ((C8634l) this.f21690l).metrica();
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) throws Exception {
        ((InterfaceC11792l) this.f21690l).close();
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: native */
    public InterfaceC11792l mo1996native() {
        return m2946switch(((C8634l) this.f21690l).mo1996native());
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public void m2957new() {
        short[] sArr;
        short[] sArr2 = (short[]) this.f21690l;
        int i = 2;
        int i2 = 0;
        while (true) {
            sArr = AbstractC13573l.loadAd;
            if (i > 128) {
                break;
            }
            int i3 = 0;
            while (i3 < 256) {
                int i4 = i2 + 1;
                short s = sArr[i2];
                int i5 = i3;
                while (i5 < i3 + i) {
                    short s2 = sArr2[i5];
                    int i6 = i5 + i;
                    short s3 = sArr2[i6];
                    short s4 = (short) (s2 + s3);
                    sArr2[i5] = (short) (s4 - ((short) (((short) ((s4 * 20159) >> 26)) * 3329)));
                    sArr2[i6] = AbstractC10802l.amazon(((short) (s2 - s3)) * s);
                    i5++;
                }
                i3 = i5 + i;
                i2 = i4;
            }
            i <<= 1;
        }
        for (int i7 = 0; i7 < 256; i7++) {
            sArr2[i7] = AbstractC10802l.amazon(sArr2[i7] * sArr[127]);
        }
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C4816l c4816l = (C4816l) this.f21690l;
        int i = AbstractC9795l.yandex;
        c4816l.mopub(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package */
    public AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f21690l).mo1830package(abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC12679l
    public void premium(InterfaceC5755l interfaceC5755l, Executor executor) {
        ((C8634l) this.f21690l).premium(new C15263l(this, interfaceC5755l, 11), executor);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m2958private(C10685l c10685l) {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.f21690l;
            sArr[i] = (short) (sArr[i] + ((short[]) c10685l.f21690l)[i]);
        }
    }

    @Override // defpackage.InterfaceC17224l
    public void pro(C6788l c6788l, Context context, Looper looper, Looper looper2, C18527l c18527l) {
        ((InterfaceC17224l) this.f21690l).pro(c6788l, context, looper, looper2, c18527l);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public AbstractC12669l m2959public(AbstractC12669l abstractC12669l) {
        Object value;
        AbstractC12669l abstractC12669l2;
        C1008l c1008l = (C1008l) this.f21690l;
        do {
            value = c1008l.getValue();
            abstractC12669l2 = (AbstractC12669l) value;
            if ((abstractC12669l2 instanceof C1046l) || AbstractC8576l.yandex(abstractC12669l2, C3489l.loadAd)) {
                abstractC12669l2 = abstractC12669l;
            } else if (abstractC12669l2 instanceof C2856l) {
                if (abstractC12669l.yandex > ((C2856l) abstractC12669l2).yandex) {
                    abstractC12669l2 = abstractC12669l;
                }
            } else if (!(abstractC12669l2 instanceof C15647l)) {
                if (abstractC12669l2 instanceof C11577l) {
                    C8339l.smaato("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                C18725l.billing();
                return null;
            }
        } while (!c1008l.firebase(value, abstractC12669l2));
        return abstractC12669l2;
    }

    @Override // defpackage.InterfaceC12679l
    public int purchase() {
        return ((C8634l) this.f21690l).purchase();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.InterfaceC8038l
    public C17032l remoteconfig(C13003l c13003l, C18389l c18389l) {
        String str;
        List<C5999l> list;
        String str2;
        String str3;
        Charset charsetForName;
        C8195l c8195l = ((C8410l) this.f21690l).crashlytics;
        if (c8195l == null) {
            return null;
        }
        String str4 = (String) c8195l.f17098l;
        String str5 = (String) c8195l.f17097l;
        if (c18389l.f35915l != 407) {
            return null;
        }
        C8309l c8309l = c18389l.f35918l;
        int i = c18389l.f35915l;
        if (i != 401) {
            if (i != 407) {
                list = C2580l.f5619l;
            } else {
                str = "Proxy-Authenticate";
            }
            for (C5999l c5999l : list) {
                str2 = c5999l.yandex;
                if (!"Basic".equalsIgnoreCase(str2) || "OkHttp-Preemptive".equalsIgnoreCase(str2)) {
                    str3 = (String) c5999l.loadAd.get("charset");
                    if (str3 != null) {
                        try {
                            charsetForName = Charset.forName(str3);
                        } catch (Exception unused) {
                            charsetForName = AbstractC9050l.amazon;
                        }
                    } else {
                        charsetForName = AbstractC9050l.amazon;
                    }
                    String strConcat = "Basic ".concat(yandex.yandex((str4 + ':' + str5).getBytes(charsetForName), yandex.yandex));
                    C11644l c11644lYandex = c18389l.f35911l.yandex();
                    ((C16543l) c11644lYandex.f23361l).signatures("Proxy-Authorization", strConcat);
                    return new C17032l(c11644lYandex);
                }
            }
            return null;
        }
        str = "WWW-Authenticate";
        C3844l c3844l = AbstractC0548l.yandex;
        ArrayList arrayList = new ArrayList();
        int size = c8309l.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(c8309l.billing(i2))) {
                C0869l c0869l = new C0869l();
                c0869l.m718l(c8309l.firebase(i2));
                try {
                    AbstractC0548l.loadAd(c0869l, arrayList);
                } catch (EOFException e) {
                    AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                    AbstractC16844l.yandex.subs(5, "Unable to parse challenge", e);
                }
            }
        }
        list = arrayList;
        while (r0.hasNext()) {
            str2 = c5999l.yandex;
            if (!"Basic".equalsIgnoreCase(str2)) {
            }
            str3 = (String) c5999l.loadAd.get("charset");
            if (str3 != null) {
                charsetForName = Charset.forName(str3);
            } else {
                charsetForName = AbstractC9050l.amazon;
            }
            String strConcat2 = "Basic ".concat(yandex.yandex((str4 + ':' + str5).getBytes(charsetForName), yandex.yandex));
            C11644l c11644lYandex2 = c18389l.f35911l.yandex();
            ((C16543l) c11644lYandex2.f23361l).signatures("Proxy-Authorization", strConcat2);
            return new C17032l(c11644lYandex2);
        }
        return null;
    }

    @Override // defpackage.InterfaceC12679l
    public InterfaceC11792l smaato() {
        return m2946switch(((C8634l) this.f21690l).smaato());
    }

    @Override // defpackage.InterfaceC12679l
    public void startapp() {
        ((C8634l) this.f21690l).startapp();
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m2960static(byte b, C17951l c17951l, byte[] bArr) {
        byte[] bArr2 = new byte[192];
        c17951l.billing(32, 32, bArr);
        c17951l.update(b);
        c17951l.crashlytics(0, 192, bArr2);
        for (int i = 0; i < 64; i++) {
            int iAds = AbstractC10000l.ads(i * 3, bArr2);
            int i2 = (iAds & 2396745) + ((iAds >>> 1) & 2396745) + ((iAds >>> 2) & 2396745);
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = i3 * 6;
                ((short[]) this.f21690l)[(i * 4) + i3] = (short) (((short) ((i2 >>> i4) & 7)) - ((short) ((i2 >>> (i4 + 3)) & 7)));
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: strictfp */
    public int mo1997strictfp() {
        return ((C8634l) this.f21690l).mo1997strictfp();
    }

    @Override // defpackage.InterfaceC0612l
    public void subs() {
        C11727l c11727l = (C11727l) this.f21690l;
        Surface surface = c11727l.f23468l;
        if (surface != null) {
            C13645l c13645l = c11727l.f23508l;
            Handler handler = (Handler) c13645l.f26671l;
            if (handler != null) {
                handler.post(new RunnableC3950l(2, SystemClock.elapsedRealtime(), c13645l, surface));
            }
            c11727l.f23491l = true;
        }
    }

    @Override // defpackage.InterfaceC15930l
    public AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f21690l).subscription(j, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public void m2961super() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.f21690l;
            short s = sArr[i];
            sArr[i] = (short) (s - ((short) (((short) ((s * 20159) >> 26)) * 3329)));
        }
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        C16463l c16463l = (C16463l) ((C10685l) this.f21690l).f21690l;
        try {
            if (!c18389l.f35909l) {
                c16463l.subs(Boolean.FALSE);
                return;
            }
            JSONObject jSONObject = new JSONObject(c18389l.f35907l.vip()).getJSONObject("session");
            String string = jSONObject.getString("name");
            AbstractC4340l.yandex.edit().putString("username", string).putString("sessionKey", jSONObject.getString("key")).apply();
            c16463l.subs(Boolean.TRUE);
        } catch (JSONException e) {
            e.printStackTrace();
            c16463l.subs(Boolean.FALSE);
        } finally {
            c18389l.close();
        }
    }

    @Override // defpackage.InterfaceC8170l
    public void tapsense(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f21690l).setResultCode(i);
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw */
    public void mo1671throw(IOException iOException) {
        ((C16463l) ((C10685l) this.f21690l).f21690l).subs(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws */
    public AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f21690l).mo1831throws(j, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC17224l
    public boolean vip() {
        return ((InterfaceC17224l) this.f21690l).vip();
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile */
    public long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((C12014l) this.f21690l).mo1832volatile(abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC15930l
    public boolean yandex() {
        ((C12014l) this.f21690l).getClass();
        return false;
    }

    @Override // defpackage.InterfaceC0612l
    public void billing(C15074l c15074l) {
    }

    public /* synthetic */ C10685l(Object obj) {
        this.f21690l = obj;
    }
}
