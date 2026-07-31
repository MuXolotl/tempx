package androidx.car.app.model;

import defpackage.AbstractC3011l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class ActionStrip {
    private final List<Action> mActions;

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActions;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Action getFirstActionOfType(int i) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        return "[action count: " + this.mActions.size() + "]";
    }

    public ActionStrip(AbstractC3011l abstractC3011l) {
        throw null;
    }
}
