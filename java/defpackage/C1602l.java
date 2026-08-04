package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1602l implements InterfaceC14762l {
    public static final C1602l yandex = new C1602l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(VKXApplication vKXApplication, EnumC11447l enumC11447l, AbstractC0283l abstractC0283l) {
        C16224l c16224l;
        Object c18435l;
        if (abstractC0283l instanceof C16224l) {
            c16224l = (C16224l) abstractC0283l;
            int i = c16224l.f31763l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16224l.f31763l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16224l = new C16224l(abstractC0283l);
            }
        } else {
            c16224l = new C16224l(abstractC0283l);
        }
        Object obj = c16224l.f31764l;
        int i2 = c16224l.f31763l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                C3312l c3312l = new C3312l();
                C15079l c15079l = new C15079l(27, enumC11447l);
                c16224l.f31763l = 1;
                Object objRemoteconfig = c3312l.remoteconfig(vKXApplication, c15079l, c16224l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objRemoteconfig == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    public static String billing(AbstractC18643l abstractC18643l) {
        String string;
        String strConcat = null;
        if (abstractC18643l instanceof AudioTrack) {
            String strMopub = AbstractC16676l.mopub((AudioTrack) abstractC18643l);
            C5198l c5198lM3161l = C6336l.loadAd.m3161l();
            CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{strMopub}, 1))) : null;
            if (cachedTrack != null) {
                AudioTrack audioTrackCrashlytics = cachedTrack.crashlytics();
                C7268l.f15111l.getClass();
                Uri uriAdmob = C7268l.admob(audioTrackCrashlytics);
                if (uriAdmob != null && (string = uriAdmob.toString()) != null) {
                    strConcat = "file://".concat(string);
                }
            }
        }
        if (strConcat != null) {
            return strConcat;
        }
        String amazon = abstractC18643l.getAmazon();
        return amazon == null ? "" : amazon;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object purchase(VKXApplication vKXApplication, AbstractC18643l abstractC18643l, AbstractC0283l abstractC0283l) {
        C13282l c13282l;
        Object c18435l;
        if (abstractC0283l instanceof C13282l) {
            c13282l = (C13282l) abstractC0283l;
            int i = c13282l.f26064l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13282l.f26064l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13282l = new C13282l(abstractC0283l);
            }
        } else {
            c13282l = new C13282l(abstractC0283l);
        }
        Object obj = c13282l.f26065l;
        int i2 = c13282l.f26064l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                C3312l c3312l = new C3312l();
                C5610l c5610l = new C5610l(abstractC18643l, 0);
                c13282l.f26064l = 1;
                Object objRemoteconfig = c3312l.remoteconfig(vKXApplication, c5610l, c13282l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objRemoteconfig == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14762l
    public final void loadAd(EnumC11447l enumC11447l) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C4073l(enumC11447l, null), 3);
    }

    @Override // defpackage.InterfaceC14762l
    public final void yandex(AbstractC18643l abstractC18643l, AbstractC18643l abstractC18643l2) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C18179l(abstractC18643l, null), 3);
    }

    @Override // defpackage.InterfaceC14762l
    public final void crashlytics(long j) {
    }
}
