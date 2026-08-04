package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؚؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1694l {
    public final ArrayList admob;
    public final CarIcon amazon;
    public List billing;
    public final C18283l crashlytics;
    public final CarText loadAd;
    public final InterfaceC5141l mopub;
    public final boolean purchase;
    public final String yandex;

    public C1694l(ConversationItem conversationItem) {
        this.yandex = conversationItem.getId();
        this.loadAd = conversationItem.getTitle();
        this.crashlytics = conversationItem.getSelf();
        this.amazon = conversationItem.getIcon();
        this.purchase = conversationItem.isGroupConversation();
        this.mopub = conversationItem.getConversationCallbackDelegate();
        this.billing = conversationItem.getMessages();
        this.admob = new ArrayList(conversationItem.getActions());
    }
}
