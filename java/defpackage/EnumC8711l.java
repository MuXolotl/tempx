package defpackage;

import java.util.HashMap;
import java.util.logging.Level;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌِؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC8711l {
    /* JADX INFO: Fake field, exist only in values array */
    ALL(Level.ALL),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE(Level.FINEST),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG(Level.FINER),
    /* JADX INFO: Fake field, exist only in values array */
    INFO(Level.FINE),
    /* JADX INFO: Fake field, exist only in values array */
    WARN(Level.WARNING),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(Level.SEVERE),
    /* JADX INFO: Fake field, exist only in values array */
    CRITICAL(new Level() { // from class: lِٖؗ
    }),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(Level.OFF);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Level f17926l;

    static {
        HashMap map = new HashMap(8);
        for (EnumC8711l enumC8711l : values()) {
            map.put(enumC8711l.f17926l, enumC8711l);
        }
        Unit unit = Unit.INSTANCE;
    }

    EnumC8711l(Level level) {
        this.f17926l = level;
    }
}
