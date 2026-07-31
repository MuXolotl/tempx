package androidx.car.app.model;

import defpackage.AbstractC17776l;
import defpackage.C5233l;
import defpackage.C8081l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class MessageTemplate implements InterfaceC11389l {
    private final List<Action> mActionList;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;

    @Deprecated
    private final CarText mTitle;

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && Objects.equals(this.mHeader, messageTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        C5233l c5233l = new C5233l();
        CarText carText = this.mTitle;
        if (carText != null) {
            c5233l.crashlytics = carText;
            C8081l.purchase.loadAd(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            c5233l.loadAd(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            for (Action action2 : actionStrip.getActions()) {
                Objects.requireNonNull(action2);
                c5233l.yandex.add(action2);
            }
        }
        return c5233l.yandex();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        Objects.requireNonNull(carText);
        return carText;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "MessageTemplate";
    }

    public MessageTemplate(AbstractC17776l abstractC17776l) {
        throw null;
    }
}
