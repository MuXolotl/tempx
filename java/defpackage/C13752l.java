package defpackage;

import android.net.ConnectivityManager;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؙْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13752l extends AbstractC7877l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AudioTrack f26845l;

    public C13752l(AudioTrack audioTrack) {
        super(R.string.content_blocked_audio, 2);
        this.f26845l = audioTrack;
    }

    @Override // defpackage.AbstractC7877l
    public final List isPro() {
        File file = AbstractC7462l.yandex;
        if (AbstractC7462l.loadAd(this.f26845l) != 3) {
            final int i = 0;
            return Collections.singletonList(new C16179l(R.string.content_blocked_actions_unlock_artist, R.drawable.ic_block_outline_28, new Function1(this) { // from class: lؚٕۧ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C13752l f31523l;

                {
                    this.f31523l = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws IOException {
                    int i2 = i;
                    C13752l c13752l = this.f31523l;
                    AppActivity appActivity = (AppActivity) obj;
                    switch (i2) {
                        case 0:
                            File file2 = AbstractC7462l.yandex;
                            AudioTrack audioTrack = c13752l.f26845l;
                            int iInmobi = AbstractC5020l.inmobi(AbstractC7462l.loadAd(audioTrack));
                            if (iInmobi == 0) {
                                C5374l c5374lYandex = AbstractC16584l.yandex();
                                VKXApplication vKXApplication = VKXApplication.f36631l;
                                AbstractC4072l.pro(c5374lYandex, vKXApplication != null ? vKXApplication : null, new C15079l(5, appActivity));
                            } else if (iInmobi == 1) {
                                for (MainArtist mainArtist : AbstractC16676l.loadAd(audioTrack)) {
                                    File file3 = AbstractC7462l.yandex;
                                    String str = mainArtist.yandex;
                                    if (str == null) {
                                        str = "";
                                    }
                                    AbstractC7462l.loadAd.remove(str);
                                    AbstractC7462l.crashlytics();
                                }
                            } else if (iInmobi != 2) {
                                C18725l.billing();
                                return null;
                            }
                            return Unit.INSTANCE;
                        default:
                            StringBuilder sb = new StringBuilder();
                            AudioTrack audioTrack2 = c13752l.f26845l;
                            sb.append(audioTrack2.yandex);
                            sb.append(' ');
                            sb.append(audioTrack2.amazon);
                            appActivity.license(new C15288l(sb.toString()));
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        final int i2 = 1;
        c10227lAdmob.add(new C16179l(R.string.content_blocked_actions_find_track, R.drawable.ic_search_outline_28, new Function1(this) { // from class: lؚٕۧ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13752l f31523l;

            {
                this.f31523l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws IOException {
                int i3 = i2;
                C13752l c13752l = this.f31523l;
                AppActivity appActivity = (AppActivity) obj;
                switch (i3) {
                    case 0:
                        File file2 = AbstractC7462l.yandex;
                        AudioTrack audioTrack = c13752l.f26845l;
                        int iInmobi = AbstractC5020l.inmobi(AbstractC7462l.loadAd(audioTrack));
                        if (iInmobi == 0) {
                            C5374l c5374lYandex = AbstractC16584l.yandex();
                            VKXApplication vKXApplication = VKXApplication.f36631l;
                            AbstractC4072l.pro(c5374lYandex, vKXApplication != null ? vKXApplication : null, new C15079l(5, appActivity));
                        } else if (iInmobi == 1) {
                            for (MainArtist mainArtist : AbstractC16676l.loadAd(audioTrack)) {
                                File file3 = AbstractC7462l.yandex;
                                String str = mainArtist.yandex;
                                if (str == null) {
                                    str = "";
                                }
                                AbstractC7462l.loadAd.remove(str);
                                AbstractC7462l.crashlytics();
                            }
                        } else if (iInmobi != 2) {
                            C18725l.billing();
                            return null;
                        }
                        return Unit.INSTANCE;
                    default:
                        StringBuilder sb = new StringBuilder();
                        AudioTrack audioTrack2 = c13752l.f26845l;
                        sb.append(audioTrack2.yandex);
                        sb.append(' ');
                        sb.append(audioTrack2.amazon);
                        appActivity.license(new C15288l(sb.toString()));
                        return Unit.INSTANCE;
                }
            }
        }));
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.AbstractC7877l
    public final String smaato() {
        File file = AbstractC7462l.yandex;
        AudioTrack audioTrack = this.f26845l;
        if (AbstractC7462l.loadAd(audioTrack) != 3) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            return (vKXApplication != null ? vKXApplication : null).getString(R.string.content_blocked_manual);
        }
        int i = audioTrack.remoteconfig;
        switch (i) {
            case -1:
                return "[VKX] Custom Filter";
            case 0:
                return "Трек не был заблокирован со стороны ВК, однако ссылка на него пуста. Возможно, на стороне ВК сейчас проблемы - попробуйте обновить страницу через некоторое время.";
            case 1:
                return "Трек был изъят из ВК правобладателем. Оригинальный трек больше недоступен - ищите перезалив.";
            case 2:
                ConnectivityManager connectivityManager = VKXApplication.f36630l;
                return AbstractC13950l.m3811for(connectivityManager != null ? connectivityManager : null) ? "Трек заблокирован по геолокации. VK X обнаружил, что у вас включен VPN или частный DNS: смените регион в нем на одну из стран СНГ, выключите его или оформите подписку \"VK Музыка\"." : "Трек заблокирован по геолокации. Включите VPN, если хотите прослушивать музыку без подписки \"VK Музыка\".";
            case 3:
                return "Данный трек доступен только по подписке \"VK Музыка\", которая не связяна с VK X. Это серверное ограничение.";
            case 4:
                return "Требуется замена";
            case 5:
                return "Трек еще не опубликован.";
            case 6:
                return "Вы находитесь вне стран СНГ. Включите VPN, если хотите прослушивать музыку без подписки \"VK Музыка\".";
            case 7:
                return "Трек был удален из-за нарушений правил платформы ВК или по запросу Роскомнадзора.";
            case 8:
                return "Ваша подписка \"VK Музыка\" была приостановлена.";
            case 9:
                return "VK говорит, что нужно обновить приложение. Скорее всего, вам нужно обновить VK X.";
            case 10:
                return "Трек был изъят из ВК правобладателем Warner. Оригинальный трек больше недоступен - ищите перезалив.";
            case 11:
                return "Podcast Subscription Required";
            case 12:
                return "Вы выиграли в шведской лотерее";
            case 13:
                return "Ошибка на стороне сервера";
            case 14:
                return "Трек был изъят из ВК правобладателем Jam. Оригинальный трек больше недоступен - ищите перезалив.";
            default:
                switch (i) {
                    case 21:
                        return "Story Unavailable";
                    case 22:
                        return "Story Free";
                    case 23:
                        return "Story Paid";
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        return "Детский режим: скорее всего, требуется отдельная подписка от самого ВК, которая еще не была запущена на момент написания данного текста";
                    default:
                        return AbstractC0653l.vip(i, "Unknown: ");
                }
        }
    }
}
