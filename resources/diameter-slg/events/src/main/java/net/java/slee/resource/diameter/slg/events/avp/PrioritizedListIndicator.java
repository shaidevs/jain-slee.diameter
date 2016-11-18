/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, TeleStax Inc. and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 *   JBoss, Home of Professional Open Source
 *   Copyright 2007-2011, Red Hat, Inc. and individual contributors
 *   by the @authors tag. See the copyright.txt in the distribution for a
 *   full listing of individual contributors.
 *
 *   This is free software; you can redistribute it and/or modify it
 *   under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation; either version 2.1 of
 *   the License, or (at your option) any later version.
 *
 *   This software is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this software; if not, write to the Free
 *   Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *   02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package net.java.slee.resource.diameter.slg.events.avp;

import java.io.Serializable;
import net.java.slee.resource.diameter.base.events.avp.Enumerated;

/**
 * Java class representing the Prioritized-List-Indicator enumerated type.
 * From the Diameter-based ELP SLg Reference Point Protocol Details (3GPP TS 29.172 V13.0.0) specification
 *
 * <pre>
 * 7.4.51	Prioritized-List-Indicator
 * The Prioritized-List-Indicator AVP is of type Enumerated and it indicates if the PLMN-ID-List is provided in prioritized order or not.
 * The following values are defined:
 * 		NOT_PRIORITIZED  (0)
 * 		PRIORITIZED (1)
 * </pre>
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public class PrioritizedListIndicator implements Enumerated, Serializable {

  private static final long serialVersionUID = 1L;

  public static final int _NOT_PRIORITIZED = 0;
  public static final int _PRIORITIZED = 1;

  public static final PrioritizedListIndicator NOT_PRIORITIZED = new PrioritizedListIndicator(_NOT_PRIORITIZED);
  public static final PrioritizedListIndicator PRIORITIZED = new PrioritizedListIndicator(_PRIORITIZED);

  private int value = -1;

  private PrioritizedListIndicator(int value) {
    this.value = value;
  }

  public static PrioritizedListIndicator fromInt(int type) {
    switch (type) {
      case _NOT_PRIORITIZED:
        return NOT_PRIORITIZED;
      case _PRIORITIZED:
        return PRIORITIZED;
      default:
        throw new IllegalArgumentException("Invalid value: " + type);
    }
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    switch (value) {
      case _NOT_PRIORITIZED:
        return "NOT_PRIORITIZED";
      case _PRIORITIZED:
        return "PRIORITIZED";
      default:
        return "<Invalid Value>";
    }
  }

}
