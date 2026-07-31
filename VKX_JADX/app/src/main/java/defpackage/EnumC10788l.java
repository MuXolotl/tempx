package defpackage;

import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC10788l {
    f21802l(VKXApplication.Companion.loadAd(R.string.hint_artist_title), VKXApplication.Companion.loadAd(R.string.hint_artist_desc)),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("\"Сейчас играет\"", "Здесь вы можете получить доступ к эквалайзеру, таймеру сна и тексту песни."),
    f21807l("Меню плейлиста", "Это меню служит для скачивания или кеширования плейлиста.\n\nЕсли вы можете управлять плейлистом, вы сможете здесь его редактировать."),
    f21806l("Переключение между источниками", "Для того, чтобы переключаться между треками в ВК и треками на устройстве, достаточно задержать на любую иконку в докбаре.\n\nНажмите на подсказку, чтобы продолжить."),
    f21810l("Где находятся моя скачанная библиотека?", "Скачанная библиотека существует как отдельный плейлист.\n\nДля доступа к нему оффлайн откройте раздел \"Мои треки\" в разделе \"Загружено\".\n\nУчтите, что плейлист будет доступен только после успешного кеширования всей библиотеки!"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Смена метаданных трека", "Нажмите, чтобы изменить название трека или исполнителя до загрузки его на сервер."),
    f21803l("", ""),
    f21804l("", ""),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("", ""),
    f21809l(VKXApplication.Companion.loadAd(R.string.hint_snippets), VKXApplication.Companion.loadAd(R.string.hint_snippets_text)),
    f21805l("", ""),
    f21811l("", "");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f21812l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f21813l;

    static {
        VKXApplication.Companion companion = VKXApplication.f36628l;
    }

    EnumC10788l(String str, String str2) {
        this.f21813l = str;
        this.f21812l = str2;
    }
}
