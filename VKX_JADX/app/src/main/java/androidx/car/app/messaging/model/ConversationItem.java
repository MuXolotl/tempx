package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.AbstractC5641l;
import defpackage.AbstractC6427l;
import defpackage.AbstractC7303l;
import defpackage.C1083l;
import defpackage.C1694l;
import defpackage.C18283l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC17124l;
import defpackage.InterfaceC5141l;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class ConversationItem implements InterfaceC17124l {
    private final List<Action> mActions;
    private final InterfaceC5141l mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final C18283l mSelf;
    private final CarText mTitle;

    public ConversationItem(C1694l c1694l) {
        String str = c1694l.yandex;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = c1694l.loadAd;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(c1694l.crashlytics);
        this.mIcon = c1694l.amazon;
        this.mIsGroupConversation = c1694l.purchase;
        List<CarMessage> listRemoteconfig = AbstractC6427l.remoteconfig(c1694l.billing);
        Objects.requireNonNull(listRemoteconfig);
        this.mMessages = listRemoteconfig;
        AbstractC5641l.purchase("Message list cannot be empty.", !listRemoteconfig.isEmpty());
        Iterator<CarMessage> it = listRemoteconfig.iterator();
        while (it.hasNext()) {
            AbstractC5641l.purchase("Message list cannot contain null messages", it.next() != null);
        }
        InterfaceC5141l interfaceC5141l = c1694l.mopub;
        Objects.requireNonNull(interfaceC5141l);
        this.mConversationCallbackDelegate = interfaceC5141l;
        this.mActions = AbstractC6427l.remoteconfig(c1694l.admob);
        this.mIndexable = true;
    }

    public static C18283l validateSender(C18283l c18283l) {
        Objects.requireNonNull(c18283l);
        Objects.requireNonNull(c18283l.yandex);
        Objects.requireNonNull(c18283l.amazon);
        return c18283l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && AbstractC7303l.yandex(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public InterfaceC5141l getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public C18283l getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(AbstractC7303l.amazon(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        C18283l c18283l = new C18283l();
        c18283l.yandex = "";
        c18283l.loadAd = null;
        c18283l.crashlytics = null;
        c18283l.amazon = null;
        c18283l.purchase = false;
        c18283l.billing = false;
        this.mSelf = c18283l;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new C1083l(27));
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
